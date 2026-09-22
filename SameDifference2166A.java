import java.util.*;
import java.io.*;

public class SameDifference2166A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            char target = s.charAt(n - 1);
            int count = 0;
            for (int i = 0; i < n - 1; i++) {
                if (s.charAt(i) != target) count++;
            }
            sb.append(count).append('\n');
        }
        System.out.print(sb);
    }
}