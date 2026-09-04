import java.util.*;
import java.io.*;

public class SimonsAndCakesForSuccess2205B{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            sb.append(radical(n)).append('\n');
        }
        
        System.out.print(sb);
    }
    
    static long radical(long n) {
        long result = 1;
        for (long p = 2; p * p <= n; p++) {
            if (n % p == 0) {
                result *= p;
                while (n % p == 0) {
                    n /= p;
                }
            }
        }
        if (n > 1) {
            result *= n;
        }
        return result;
    }
}