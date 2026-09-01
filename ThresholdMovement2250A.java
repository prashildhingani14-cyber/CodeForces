import java.util.*;
import java.io.*;

public class ThresholdMovement2250A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] w = new long[n + 1]; // 1-indexed
            for (int i = 1; i <= n; i++) {
                w[i] = Long.parseLong(st.nextToken());
            }

            if (n % 2 != 0) {
                sb.append("NO\n");
                continue;
            }

            long minOdd = Long.MAX_VALUE;  // min weight at odd positions (1,3,5,...)
            long maxEven = Long.MIN_VALUE; // max weight at even positions (2,4,6,...)

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 1) {
                    minOdd = Math.min(minOdd, w[i]);
                } else {
                    maxEven = Math.max(maxEven, w[i]);
                }
            }

            // need integer k with maxEven < k < minOdd
            if (minOdd - maxEven >= 2) {
                sb.append("YES\n");
            } else {
                sb.append("NO\n");
            }
        }

        System.out.print(sb);
    }
}