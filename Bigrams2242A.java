import java.io.DataInputStream;
import java.io.IOException;

public class Bigrams2242A {
    public static void main(String[] args) throws IOException {
        FastReader in = new FastReader();
        int t = in.nextInt();
        StringBuilder sb = new StringBuilder();
        while (t-- > 0) {
            int k = in.nextInt();
            boolean big = false;      // some c_i >= 3
            int atLeastTwo = 0;       // count of c_i >= 2
            for (int i = 0; i < k; i++) {
                int c = in.nextInt();
                if (c >= 3) big = true;
                if (c >= 2) atLeastTwo++;
            }
            sb.append(big || atLeastTwo >= 2 ? "YES" : "NO").append('\n');
        }
        System.out.print(sb);
    }

    static class FastReader {
        private final int BUF = 1 << 16;
        private final DataInputStream din = new DataInputStream(System.in);
        private final byte[] buffer = new byte[BUF];
        private int ptr = 0, len = 0;

        int nextInt() throws IOException {
            int ret = 0;
            int b = read();
            while (b <= ' ') b = read();
            boolean neg = (b == '-');
            if (neg) b = read();
            while (b >= '0' && b <= '9') {
                ret = ret * 10 + (b - '0');
                b = read();
            }
            return neg ? -ret : ret;
        }

        private int read() throws IOException {
            if (ptr == len) {
                len = din.read(buffer, 0, BUF);
                ptr = 0;
                if (len == -1) return -1;
            }
            return buffer[ptr++];
        }
    }
}