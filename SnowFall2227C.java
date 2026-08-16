import java.io.*;
import java.util.*;

public class SnowFall2227C {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        StringBuilder sb = new StringBuilder();

        int t = nextInt(in);
        while (t-- > 0) {
            int n = nextInt(in);
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = nextInt(in);

            // buckets: six-type (div by 2 and 3), two-type (div by 2 only),
            // one-type (neither), three-type (div by 3 only)
            int[] six = new int[n];
            int[] two = new int[n];
            int[] one = new int[n];
            int[] three = new int[n];
            int cSix = 0, cTwo = 0, cOne = 0, cThree = 0;

            for (int i = 0; i < n; i++) {
                int v = a[i];
                boolean d2 = (v % 2 == 0);
                boolean d3 = (v % 3 == 0);
                if (d2 && d3) six[cSix++] = v;
                else if (d2) two[cTwo++] = v;
                else if (d3) three[cThree++] = v;
                else one[cOne++] = v;
            }

            for (int i = 0; i < cSix; i++) { sb.append(six[i]); sb.append(' '); }
            for (int i = 0; i < cTwo; i++) { sb.append(two[i]); sb.append(' '); }
            for (int i = 0; i < cOne; i++) { sb.append(one[i]); sb.append(' '); }
            for (int i = 0; i < cThree; i++) { sb.append(three[i]); sb.append(' '); }
            sb.append('\n');
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
        if (b == '-') { neg = true; b = in.read(); }
        while (b >= '0' && b <= '9') {
            ret = ret * 10 + (b - '0');
            b = in.read();
        }
        return neg ? -ret : ret;
    }
}