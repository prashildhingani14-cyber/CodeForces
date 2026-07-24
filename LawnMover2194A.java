import java.util.*;

public class LawnMover2194A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            long w = sc.nextLong();

            if (w == 1) {
                System.out.println(0);
            } else {
                System.out.println(n - (n / w));
            }
        }
    }
}
