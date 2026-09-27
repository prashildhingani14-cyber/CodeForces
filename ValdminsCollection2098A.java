import java.util.*;
import java.io.*;

public class ValdminsCollection2098A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            char[] s = br.readLine().trim().toCharArray();
            int[] count = new int[10];
            for (char c : s) count[c - '0']++;

            char[] result = new char[10];
            for (int i = 0; i < 10; i++) {
                int threshold = 9 - i; // digit at position i (0-indexed) must be >= 9-i
                // find smallest available digit >= threshold
                for (int d = threshold; d <= 9; d++) {
                    if (count[d] > 0) {
                        result[i] = (char) ('0' + d);
                        count[d]--;
                        break;
                    }
                }
            }
            sb.append(new String(result)).append('\n');
        }

        System.out.print(sb);
    }
}