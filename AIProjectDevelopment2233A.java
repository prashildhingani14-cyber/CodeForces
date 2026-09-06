import java.io.*;
import java.util.*;

public class AIProjectDevelopment2233A{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            long z = Long.parseLong(st.nextToken());

            long best = Long.MAX_VALUE;

            // Option 1: no AI, both write from hour 1: h*(x+y) >= n
            long t1 = ceilDiv(n, x + y);
            best = Math.min(best, t1);

            // Option 2: AI setup for z hours (only Maxim writes x/hr),
            // then both write at x + 10*y per hour.
            long duringSetup = ceilDiv(n, x);
            if (duringSetup <= z) {
                // finished before AI setup even ends
                best = Math.min(best, duringSetup);
            } else {
                long afterSetupLines = n - x * z; // lines still needed after setup ends
                long rate = x + 10 * y;
                long extraHours = ceilDiv(afterSetupLines, rate);
                long t2 = z + extraHours;
                best = Math.min(best, t2);
            }

            sb.append(best).append('\n');
        }
        System.out.print(sb);
    }

    private static long ceilDiv(long a, long b) {
        if (a <= 0) return 0;
        return (a + b - 1) / b;
    }
}