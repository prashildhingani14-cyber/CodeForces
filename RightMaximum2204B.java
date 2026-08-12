import java.io.*;
import java.util.*;

public class RightMaximum2204B {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        StringBuilder sb = new StringBuilder();

        int t = nextInt(in);
        while (t-- > 0) {
            int n = nextInt(in);
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt(in);

            // pos[L] = index of rightmost maximum among a[0..L-1]
            int[] pos = new int[n + 1];
            int curMax = -1, curPos = -1;
            for (int L = 1; L <= n; L++) {
                int val = a[L - 1];
                if (val >= curMax) {
                    curMax = val;
                    curPos = L - 1;
                }
                pos[L] = curPos;
            }

            int len = n;
            long count = 0;
            while (len > 0) {
                int j = pos[len];
                count++;
                len = j;
            }

            sb.append(count).append('\n');
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