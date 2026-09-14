import java.util.*;
import java.io.*;

public class IskanderandDrawings2244A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            
            int maxRun = 0;
            int cur = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '#') {
                    cur++;
                    maxRun = Math.max(maxRun, cur);
                } else {
                    cur = 0;
                }
            }
            
            int ans;
            if (maxRun == 0) {
                ans = 0;
            } else {
                ans = (maxRun - 1) / 2 + 1;
            }
            
            sb.append(ans).append("\n");
        }
        
        System.out.print(sb);
    }
}