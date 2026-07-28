import java.util.*;

public class Suspension2158A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int y = sc.nextInt();
            int r = sc.nextInt();

            int ans = r + Math.min(y / 2, n - r);

            System.out.println(ans);
        }

        sc.close();
    }
}