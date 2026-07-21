import java.util.*;

public class DeleteandConcatenate2245B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long c = sc.nextLong();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            Arrays.sort(a);

            for (int i = 0; i < n; i++) {
                a[i] -= c;
            }

            for (int i = 0; i < n / 2; i++) {
                a[i] = Math.max(0, a[i]);
            }

            long ans = 0;
            for (long x : a) {
                ans += x;
            }

            System.out.println(ans);
        }

        sc.close();
    }
}
