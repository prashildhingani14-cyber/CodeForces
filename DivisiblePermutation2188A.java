import java.util.*;
import java.io.*;

public class DivisiblePermutation2188A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            int low = 1, high = n;
            for (int k = 0; k < n; k++) {
                if (k % 2 == 0) arr[k] = high--;
                else arr[k] = low++;
            }
            // print reversed
            for (int i = n - 1; i >= 0; i--) {
                sb.append(arr[i]);
                if (i > 0) sb.append(' ');
            }
            sb.append('\n');
        }

        System.out.print(sb);
    }
}