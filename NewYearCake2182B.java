import java.util.*;

public class NewYearCake2182B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long white = sc.nextLong();
            long dark = sc.nextLong();

            int ans = Math.max(check(white, dark, true),
                               check(white, dark, false));

            System.out.println(ans);
        }
    }

    static int check(long white, long dark, boolean whiteFirst) {
        long size = 1;
        int layers = 0;
        boolean whiteTurn = whiteFirst;

        while (true) {
            if (whiteTurn) {
                if (white < size) break;
                white -= size;
            } else {
                if (dark < size) break;
                dark -= size;
            }

            layers++;
            size *= 2;
            whiteTurn = !whiteTurn;
        }

        return layers;
    }
}