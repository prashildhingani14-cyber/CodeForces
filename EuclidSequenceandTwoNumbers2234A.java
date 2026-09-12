import java.util.*;
import java.io.*;
import java.util.stream.*;

public class  EuclidSequenceandTwoNumbers2234A  {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] b = new long[n];
            for (int i = 0; i < n; i++) {
                b[i] = Long.parseLong(st.nextToken());
            }

            // Sort descending
            Long[] arr = new Long[n];
            for (int i = 0; i < n; i++) arr[i] = b[i];
            Arrays.sort(arr, Collections.reverseOrder());

            long x = arr[0];
            long y = arr[1];

            // Generate Euclid sequence of length n starting with x, y
            long[] seq = new long[n];
            seq[0] = x;
            seq[1] = y;
            boolean valid = true;

            for (int i = 2; i < n; i++) {
                if (seq[i - 1] == 0) {
                    valid = false;
                    break;
                }
                seq[i] = seq[i - 2] % seq[i - 1];
                if (seq[i] == 0) {
                    // a value of 0 would violate "positive integers" requirement
                    // unless it's the very last check condition, but since sequence
                    // must consist of positive integers, 0 makes it invalid
                    valid = false;
                    break;
                }
            }

            if (valid) {
                for (int i = 0; i < n; i++) {
                    if (seq[i] != arr[i]) {
                        valid = false;
                        break;
                    }
                }
            }

            if (valid) {
                sb.append(x).append(' ').append(y).append('\n');
            } else {
                sb.append(-1).append('\n');
            }
        }

        System.out.print(sb);
    }
}