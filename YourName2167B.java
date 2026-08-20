import java.util.*;
import java.io.*;

public class YourName2167B {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int q = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (q-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken();
            String t = st.nextToken();

            char[] cs = s.toCharArray();
            char[] ct = t.toCharArray();
            Arrays.sort(cs);
            Arrays.sort(ct);

            sb.append(Arrays.equals(cs, ct) ? "YES" : "NO").append('\n');
        }

        System.out.print(sb);
    }
}