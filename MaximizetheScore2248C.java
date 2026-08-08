import java.io.*;
import java.util.*;

public class MaximizetheScore2248C {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in, 1 << 16));
        StringBuilder sb = new StringBuilder();

        int t = nextInt(in);
        while (t-- > 0) {
            int n = nextInt(in);
            int m = 2 * n;
            int[] a = new int[m + 1]; // 1-indexed
            for (int i = 1; i <= m; i++) a[i] = nextInt(in);

            // first occurrence position of each value, 0 if not seen yet
            int[] firstOcc = new int[n + 1];
            int[] lp = new int[m + 1]; // lp[i] = first occurrence of a[i] if this is the 2nd occurrence, else 0
            for (int i = 1; i <= m; i++) {
                int v = a[i];
                if (firstOcc[v] != 0) {
                    lp[i] = firstOcc[v];
                } else {
                    firstOcc[v] = i;
                }
            }

            long[] dp = new long[m + 1];
            dp[0] = 0;
            for (int i = 1; i <= m; i++) {
                dp[i] = dp[i - 1] + 1;
                if (lp[i] != 0) {
                    int l = lp[i];
                    long len = i - l + 1;
                    long candidate = dp[l - 1] + len * len;
                    if (candidate > dp[i]) dp[i] = candidate;
                }
            }

            sb.append(dp[m]).append('\n');
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
