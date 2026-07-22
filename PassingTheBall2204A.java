import java.util.*;

public class PassingTheBall2204A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == 'L') {
                    System.out.println(i + 1);
                    break;
                }
            }
        }
    }
}