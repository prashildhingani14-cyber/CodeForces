import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int q = sc.nextInt();

        while (q-- > 0) {
            int n = sc.nextInt();

            String s = sc.next();
            String t = sc.next();

            char[] a = s.toCharArray();
            char[] b = t.toCharArray();

            Arrays.sort(a);
            Arrays.sort(b);

            if (Arrays.equals(a, b))
                System.out.println("YES");
            else
                System.out.println("NO");
        }

        sc.close();
    }
}