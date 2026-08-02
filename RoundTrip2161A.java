import java.util.*;

public class RoundTrip2161A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long low = sc.nextLong();
            long high = low;

            long X = sc.nextLong();
            long D = sc.nextLong();
            int n = sc.nextInt();

            String s = sc.next();

            int ans = 0;

            for (char c : s.toCharArray()) {
                if (c == '1') {
                    ans++;
                    low = Math.max(0, low - D);
                    high = high + D;
                } else {
                    if (low >= X) {
                        continue;
                    }

                    ans++;
                    high = Math.min(high, X - 1);

                    low = Math.max(0, low - D);
                    high = high + D;
                }
            }

            System.out.println(ans);
        }
    }
}