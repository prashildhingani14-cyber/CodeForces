import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class SieveofErato67henes2195A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            boolean found = false;
            for (int i = 0; i < n; i++) {
                int a = Integer.parseInt(st.nextToken());
                if (a == 67) found = true;
            }
            sb.append(found ? "YES" : "NO").append("\n");
        }

        System.out.print(sb);
    }
}