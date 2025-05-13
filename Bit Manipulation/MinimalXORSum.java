import java.io.*;
import java.util.*;

public class MinimalXORSum {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            long n = Long.parseLong(st.nextToken());
            long x = Long.parseLong(st.nextToken());
            sb.append(minimalSum(n, x)).append("\n");
        }
        System.out.print(sb);
    }

    static long minimalSum(long n, long x) {
        if (n == 1) {
            return x == 0 ? -1 : x;
        } else if (n == 2) {
            long a = 1;
            long b = a ^ x;
            if (b == 0) return -1;
            return a + b;
        } else {
            long prefix = ((n - 3) % 2 == 0) ? 0 : 1;
            long a = 1, b = 2;
            long c = x ^ prefix ^ a ^ b;
            if (c == 0 || c == a || c == b) {
                a = 2; b = 3;
                c = x ^ prefix ^ a ^ b;
            }
            return (n - 3) + a + b + c;
        }
    }
}
