import java.io.*;
import java.util.*;

public class SequenceGame2164A {
    public static void main(String[] args) throws IOException {
        DataInputStream in = new DataInputStream(new BufferedInputStream(System.in));
        StreamTokenizer st = new StreamTokenizer(in);
        st.nextToken();
        int t = (int) st.nval;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st.nextToken();
            int n = (int) st.nval;
            long mn = Long.MAX_VALUE, mx = Long.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                long v = (long) st.nval;
                mn = Math.min(mn, v);
                mx = Math.max(mx, v);
            }
            st.nextToken();
            long x = (long) st.nval;
            sb.append(x >= mn && x <= mx ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }
}