import java.util.*;

public class EqualOccurrences2146A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashMap<Integer, Integer> freq = new HashMap<>();

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                freq.put(x, freq.getOrDefault(x, 0) + 1);
            }

            int ans = 0;

            for (int k = 1; k <= 100; k++) {
                int count = 0;

                for (int f : freq.values()) {
                    if (f >= k) {
                        count++;
                    }
                }

                ans = Math.max(ans, count * k);
            }

            System.out.println(ans);
        }
    }
}