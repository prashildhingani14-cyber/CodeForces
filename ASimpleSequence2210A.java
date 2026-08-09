import java.util.*;
import java.io.*;

public class ASimpleSequence2210A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            for (int i = n; i >= 1; i--) {
                sb.append(i);
                if (i > 1) sb.append(' ');
            }
            sb.append('\n');
        }
        System.out.print(sb);
    }
}