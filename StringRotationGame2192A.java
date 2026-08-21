import java.util.*;
import java.io.*;

public class StringRotationGame2192A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            int best = 0;
            for (int start = 0; start < n; start++) {
                int blocks = 1;
                for (int k = 1; k < n; k++) {
                    char prev = s.charAt((start + k - 1) % n);
                    char cur = s.charAt((start + k) % n);
                    if (cur != prev) blocks++;
                }
                best = Math.max(best, blocks);
            }
            sb.append(best).append('\n');
        }

        System.out.print(sb);
    }
}