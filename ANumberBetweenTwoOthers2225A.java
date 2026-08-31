import java.io.*;
import java.util.*;

public class ANumberBetweenTwoOthers2225A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long x = Long.parseLong(st.nextToken());
            long y = Long.parseLong(st.nextToken());
            
            long k = y / x;
            sb.append(k == 2 ? "NO" : "YES").append('\n');
        }
        
        System.out.print(sb);
    }
}