import java.util.*;

public class InTheDream2136A{

    static boolean possible(int x, int y) {
        int mx = Math.max(x, y);
        int mn = Math.min(x, y);

        return mx <= 2 * (mn + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            if (possible(a, b) && possible(c - a, d - b))
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}