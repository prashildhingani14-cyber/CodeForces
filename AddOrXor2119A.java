import java.io.*;
import java.util.*;

public class AddOrXor2119A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long a = Long.parseLong(st.nextToken());
            long b = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());

            long ans;

            if (a == b) {
                ans = 0;
            } else if (a > b) {
                // can only decrease by exactly 1, and only from an odd number
                if (a - b == 1 && (a % 2 == 1)) {
                    ans = y;
                } else {
                    ans = -1;
                }
            } else {
                // a < b : go from a up to b-1, summing per-step cost
                long minxy = Math.min(x, y);
                long cost = 0;
                for (long i = a; i < b; i++) {
                    if (i % 2 == 0) {
                        cost += minxy;
                    } else {
                        cost += x;
                    }
                }
                ans = cost;
            }

            sb.append(ans).append('\n');
        }

        System.out.print(sb);
    }
}