import java.io.*;
import java.util.*;

public class YesorYes2178A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            String s = br.readLine().trim();
            int yCount = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'Y') yCount++;
                if (yCount > 1) break; // no need to keep counting
            }
            sb.append(yCount <= 1 ? "YES" : "NO").append('\n');
        }

        System.out.print(sb);
    }
}