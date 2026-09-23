import java.util.*;
import java.io.*;

public class ShiftSort2140A{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();

            // count zeros
            int zeros = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') zeros++;
            }

            // count 1s in the first 'zeros' positions
            int ans = 0;
            for (int i = 0; i < zeros; i++) {
                if (s.charAt(i) == '1') ans++;
            }

            sb.append(ans).append("\n");
        }

        System.out.print(sb);
    }
}