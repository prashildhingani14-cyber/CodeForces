import java.io.*;
import java.util.*;

public class WhoWatchesTheWatchPig2245A{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            String s = br.readLine().trim();

            if (n < 2 * k) {
                sb.append(-1).append('\n');
                continue;
            }

            int flips = 0;
            // positions 1..k (0-indexed 0..k-1) must end up facing R
            for (int i = 0; i < k; i++) {
                if (s.charAt(i) != 'R') flips++;
            }
            // positions n-k+1..n (0-indexed n-k..n-1) must end up facing L
            for (int i = n - k; i < n; i++) {
                if (s.charAt(i) != 'L') flips++;
            }
            sb.append(flips).append('\n');
        }
        System.out.print(sb);
    }
}