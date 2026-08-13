import java.io.*;
import java.util.*;

public class PizzaTime2156A { 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            long n = Long.parseLong(br.readLine().trim());
            sb.append((n - 1) / 2).append('\n');
        }
        System.out.print(sb);
    }
}