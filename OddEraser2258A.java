import java.util.*;
import java.io.*;

public class OddEraser2258A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while(t-- > 0){
            int n = Integer.parseInt(br.readLine().trim());
            StringTokenizer st = new StringTokenizer(br.readLine());
            long[] a = new long[n];
            for(int i = 0; i < n; i++) a[i] = Long.parseLong(st.nextToken());
            if(n == 1) sb.append(a[0]).append('\n');
            else sb.append(gcd(a[0], a[n-1])).append('\n');
        }
        System.out.print(sb);
    }
    static long gcd(long a, long b){
        return b == 0 ? a : gcd(b, a % b);
    }
}