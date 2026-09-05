import java.io.*;
import java.util.*;

public class TablewithNumbers2189A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);
        st.nextToken();
        int t = (int) st.nval;
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            st.nextToken(); int n = (int) st.nval;
            st.nextToken(); int h = (int) st.nval;
            st.nextToken(); int l = (int) st.nval;
            int lo = Math.min(h, l), hi = Math.max(h, l);
            long a = 0, b = 0, c = 0;
            for (int i = 0; i < n; i++) {
                st.nextToken();
                int v = (int) st.nval;
                if (v <= lo) {
                    c++; // usable as either row or column index
                } else if (v <= hi) {
                    if (h < l) {
                        b++; // only usable as column (y)
                    } else {
                        a++; // only usable as row (x)
                    }
                }
                // else: v > hi, useless
            }
            long ans = Math.min(a + c, Math.min(b + c, (a + b + c) / 2));
            sb.append(ans).append('\n');
        }
        System.out.print(sb);
    }
}