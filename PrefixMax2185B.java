import java.util.*;

public class PrefixMax2185B {
    static long value(int[] a) {
        long sum = 0;
        int mx = 0;
        for (int x : a) {
            mx = Math.max(mx, x);
            sum += mx;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int n = sc.nextInt();

            int[] a = new int[n];

            for (int i = 0; i < n; i++)
                a[i] = sc.nextInt();

            long ans = value(a); // no swap

            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {

                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;

                    ans = Math.max(ans, value(a));

                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

            System.out.println(ans);
        }
    }
}