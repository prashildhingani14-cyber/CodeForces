import java.util.*;

public class SquareYear2114A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String s = sc.next();
            int x = Integer.parseInt(s);

            int r = (int) Math.sqrt(x);

            if (r * r == x) {
                System.out.println(0 + " " + r);
            } else {
                System.out.println(-1);
            }
        }
    }
}