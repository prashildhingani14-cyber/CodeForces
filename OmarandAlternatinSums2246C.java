import java.util.*;
import java.io.*;

public class OmarandAlternatinSums2246C {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());

        final long MOD = 1_000_000_007L;
        final int MAXN = 200005;
        long[] pow2 = new long[MAXN];
        pow2[0] = 1;
        for (int i = 1; i < MAXN; i++) pow2[i] = pow2[i-1] * 2 % MOD;

        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long[] a = new long[n];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());

            int m = 0;
            while (m < n && a[m] == -1) m++;   // count of leading -1's

            int P = n - m;                     // number of positive elements
            int r = 0;                         // number of distinct positive values
            long Q = 0;                        // # of value pairs (v, v+1) both present
            int idx = m;
            boolean first = true;
            long prevVal = 0;

            while (idx < n) {
                long v = a[idx];
                while (idx < n && a[idx] == v) idx++;
                r++;
                if (!first && v == prevVal + 1) Q++;
                prevVal = v;
                first = false;
            }

            long N0 = pow2[P - r];             // subsequences of positives with alt-sum 0
            long E, O;                          // sum of C(m,j) over even/odd j
            if (m == 0) { E = 1; O = 0; }
            else { E = pow2[m - 1]; O = pow2[m - 1]; }

            long ans = N0 % MOD * ((E + Q % MOD * O) % MOD) % MOD;
            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}