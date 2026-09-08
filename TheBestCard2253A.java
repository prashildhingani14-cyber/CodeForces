import java.io.*;
import java.util.*;

public class TheBestCard2253A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            long m = n + 1L;
            sb.append(isPrime(m) ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }

    private static boolean isPrime(long m) {
        if (m < 2) return false;
        if (m == 2 || m == 3) return true;
        if (m % 2 == 0) return false;
        for (long i = 3; i * i <= m; i += 2) {
            if (m % i == 0) return false;
        }
        return true;
    }
}