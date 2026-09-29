import java.util.*;
import java.io.*;

public class FizzBuzzRemixed2070A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            long ans = (n / 15) * 3 + Math.min(n % 15 + 1, 3);
            sb.append(ans).append("\n");
        }
        System.out.print(sb);
    }
}