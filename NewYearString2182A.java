import java.io.*;
import java.util.*;

public class NewYearString2182A{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        String target = "2026";
        String bad = "2025";
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            int countBad = 0;
            int minDist = Integer.MAX_VALUE;

            for (int i = 0; i + 4 <= n; i++) {
                boolean isBad = true;
                int dist = 0;
                for (int j = 0; j < 4; j++) {
                    char c = s.charAt(i + j);
                    if (c != bad.charAt(j)) {
                        isBad = false;
                    }
                    if (c != target.charAt(j)) {
                        dist++;
                    }
                }
                if (isBad) countBad++;
                if (dist < minDist) minDist = dist;
            }

            int ans = Math.min(countBad, minDist);
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}