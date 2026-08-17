import java.io.*;
import java.util.*;

public class AbsoluteCinema2229B {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        StringBuilder sb = new StringBuilder();

        int t = nextInt(in);
        while (t-- > 0) {
            int n = nextInt(in);
            long[] a = new long[n];
            long[] b = new long[n];
            for (int i = 0; i < n; i++) a[i] = nextInt(in);
            for (int i = 0; i < n; i++) b[i] = nextInt(in);

            long[] mn = new long[n];
            long[] mx = new long[n];
            long sumMin = 0;
            long S = 0;

            // track top1 (value, index) and top2 value among mn[]
            long top1 = Long.MIN_VALUE, top2 = Long.MIN_VALUE;
            int top1Idx = -1;

            for (int i = 0; i < n; i++) {
                long ai = a[i], bi = b[i];
                long lo = Math.min(ai, bi);
                long hi = Math.max(ai, bi);
                mn[i] = lo;
                mx[i] = hi;
                sumMin += lo;
                S += ai + bi;

                if (lo > top1) {
                    top2 = top1;
                    top1 = lo;
                    top1Idx = i;
                } else if (lo > top2) {
                    top2 = lo;
                }
            }

            long base = top1 - sumMin; // no flip
            long best = base;

            for (int j = 0; j < n; j++) {
                long mPrime = (j == top1Idx) ? top2 : top1;
                long newMax = Math.max(mx[j], mPrime);
                long newSum = sumMin - mn[j] + mx[j];
                long candidate = newMax - newSum;
                if (candidate > best) best = candidate;
            }

            long answer = S + best;
            sb.append(answer).append('\n');
        }

        System.out.print(sb);
    }

    private static int nextInt(DataInputStream in) throws IOException {
        int ret = 0;
        int b = in.read();
        while (b < '0' || b > '9') {
            if (b == '-') break;
            b = in.read();
        }
        boolean neg = false;
        if (b == '-') {
            neg = true;
            b = in.read();
        }
        while (b >= '0' && b <= '9') {
            ret = ret * 10 + (b - '0');
            b = in.read();
        }
        return neg ? -ret : ret;
    }
}