import java.io.*;
import java.util.*;

public class SocialExperiment2184A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            if (n < 4) {
                sb.append(n).append('\n');
            } else {
                sb.append(n % 2).append('\n');
            }
        }
        System.out.print(sb);
    }
}