import java.io.*;
import java.util.*;

public class EatingGame2200A{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            int total = 0;
            for (int i = 0; i < n; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                total += a[i];
            }

            boolean[] canWin = new boolean[n];

            for (int start = 0; start < n; start++) {
                int[] rem = a.clone();
                int left = total;
                int pos = start;
                int lastEater = -1;

                while (left > 0) {
                    if (rem[pos] > 0) {
                        rem[pos]--;
                        left--;
                        lastEater = pos;
                    }
                    pos = (pos + 1) % n;
                }

                if (lastEater != -1) canWin[lastEater] = true;
            }

            int count = 0;
            for (boolean b : canWin) if (b) count++;
            sb.append(count).append('\n');
        }

        System.out.print(sb);
    }
}