import java.util.*;
import java.io.*;

public class EnergyCrystals2111A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int x = Integer.parseInt(br.readLine().trim());
            int bits = 32 - Integer.numberOfLeadingZeros(x);
            sb.append(2 * bits + 1).append("\n");
        }
        System.out.print(sb);
    }
}