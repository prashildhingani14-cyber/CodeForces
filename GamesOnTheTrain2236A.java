import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GamesOnTheTrain2236A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++) {
                int h = Integer.parseInt(st.nextToken());
                if (h > max) max = h;
                if (h < min) min = h;
            }

            int k = max - min + 1;
            sb.append(k).append('\n');
        }

        System.out.print(sb);
    }
}