import java.util.*;
import java.io.*;

public class DeletionSort2200B{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = Integer.parseInt(st.nextToken());

            boolean nonDecreasing = true;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] > a[i + 1]) {
                    nonDecreasing = false;
                    break;
                }
            }

            if (nonDecreasing) {
                sb.append(n).append('\n');
            } else {
                sb.append(1).append('\n');
            }
        }
        System.out.print(sb);
    }
}