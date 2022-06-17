package baekjoon.code;

import java.io.*;
import java.util.*;

public class Q10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < t; i++) {
            st = new StringTokenizer(br.readLine());
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());

            int result;
            if (n % h == 0) {
                result = (h * 100) + (n / h);
            } else {
                result = ((n % h) * 100) + ((n / h) + 1);
            }
            sb.append(result).append("\n");
        }
        System.out.print(sb);
    }
}
