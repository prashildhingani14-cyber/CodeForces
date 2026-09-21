import java.util.*;

public class TowersofBoxes2203A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int d = sc.nextInt();
            int k = d / m + 1;              // max boxes in one tower
            int towers = (n + k - 1) / k;   // ceil(n / k)
            sb.append(towers).append("\n");
        }
        System.out.print(sb);
    }
}