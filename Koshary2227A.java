import java.util.*;
import java.io.*;

public class Koshary2227A{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            boolean xOdd = (x % 2 != 0);
            boolean yOdd = (y % 2 != 0);
            sb.append((xOdd && yOdd) ? "NO" : "YES").append("\n");
        }
        System.out.print(sb);
    }
}