import java.io.*;
import java.util.*;

public class AntimedianDeletion2211A{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            br.readLine(); // consume the permutation line — values don't matter
            for (int i = 0; i < n; i++) {
                sb.append(n == 1 ? 1 : 2);
                if (i < n - 1) sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}