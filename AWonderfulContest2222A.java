import java.util.*;

public class AWonderfulContest2222A{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            boolean ok = false;

            for (int i = 0; i < n; i++) {
                if (sc.nextInt() == 100)
                    ok = true;
            }

            System.out.println(ok ? "Yes" : "No");
        }
    }
}