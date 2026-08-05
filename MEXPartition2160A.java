import java.util.*;

public class MEXPartition2160A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();

            int[] freq = new int[102];

            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if (x <= 100) freq[x]++;
            }

            int mex = 0;
            while (freq[mex] > 0) {
                mex++;
            }

            System.out.println(mex);
        }

        sc.close();
    }
}