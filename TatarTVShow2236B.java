import java.util.*;

public class TatarTVShow2236B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();

            boolean ok = true;
            boolean[] vis = new boolean[n];

            for (int i = 0; i < n; i++) {
                if (vis[i]) continue;

                int ones = 0;

                // traverse this path to the right
                int cur = i;
                while (cur < n && !vis[cur]) {
                    vis[cur] = true;
                    if (s.charAt(cur) == '1') ones++;
                    cur += k;
                }

                if ((ones & 1) == 1) {
                    ok = false;
                    break;
                }
            }

            System.out.println(ok ? "YES" : "NO");
        }
    }
}