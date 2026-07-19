import java.util.*;

public class BingoCandies2208A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            HashMap<Integer, Integer> map = new HashMap<>();
            int maxFreq = 0;

            for (int i = 0; i < n * n; i++) {
                int x = sc.nextInt();
                int freq = map.getOrDefault(x, 0) + 1;
                map.put(x, freq);
                maxFreq = Math.max(maxFreq, freq);
            }

            if (maxFreq <= n * (n - 1))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}

