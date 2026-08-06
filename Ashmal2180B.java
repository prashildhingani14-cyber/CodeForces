import java.io.*;
import java.util.*;

public class Ashmal2180B{
    public static void main(String[] args) throws IOException {
        StreamTokenizer in = new StreamTokenizer(new BufferedReader(new InputStreamReader(System.in)));
        in.wordChars('a', 'z');
        in.wordChars('A', 'Z');

        in.nextToken();
        int t = (int) in.nval;

        StringBuilder result = new StringBuilder();

        while (t-- > 0) {
            in.nextToken();
            int n = (int) in.nval;

            String s = "";
            for (int i = 0; i < n; i++) {
                in.nextToken();
                String a = in.sval;

                if (s.isEmpty()) {
                    s = a;
                } else {
                    String appended = s + a;   // add a_i to the end
                    String prepended = a + s;  // add a_i to the beginning

                    // choose the lexicographically smaller option
                    s = (appended.compareTo(prepended) <= 0) ? appended : prepended;
                }
            }

            result.append(s).append('\n');
        }

        System.out.print(result);
    }
}