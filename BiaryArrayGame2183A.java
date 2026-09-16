import java.util.*;
import java.io.*;
import java.util.StringTokenizer;

public class BiaryArrayGame2183A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

            // Alice wins iff first element is 1, or last element is 1.
            // Bob wins only if both endpoints are 0.
            boolean aliceWins = (a[0] == 1) || (a[n - 1] == 1);
            sb.append(aliceWins ? "Alice" : "Bob").append('\n');
        }
        System.out.print(sb);
    }
}