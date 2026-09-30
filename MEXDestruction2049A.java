import java.util.*;
import java.io.*;

public class MEXDestruction2049A {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StreamTokenizer st = new StreamTokenizer(br);

        st.nextToken();
        int t = (int) st.nval;
        StringBuilder sb = new StringBuilder();

        while (t-- > 0) {
            st.nextToken();
            int n = (int) st.nval;

            int segments = 0;
            boolean inSegment = false;

            for (int i = 0; i < n; i++) {
                st.nextToken();
                int x = (int) st.nval;

                if (x != 0) {
                    if (!inSegment) {
                        segments++;
                        inSegment = true;
                    }
                } else {
                    inSegment = false;
                }
            }

            if (segments == 0) {
                sb.append(0);
            } else if (segments == 1) {
                sb.append(1);
            } else {
                sb.append(2);
            }
            sb.append("\n");
        }

        System.out.print(sb);
    }
}