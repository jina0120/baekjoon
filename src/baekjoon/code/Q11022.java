package baekjoon.code;

import java.io.*;
import java.util.*;

public class Q11022 {
    public static void main(String[] args) throws IOException {
        // 두번째 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());

            sb.append("Case #").append(i).append(": ").append(a).append(" + ").append(b).append(" = ").append(a + b).append("\n");
        }
        System.out.print(sb);

//        // 첫번째 풀이
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st;
//        StringBuilder sb = new StringBuilder();
//
//        int t = Integer.parseInt(br.readLine());
//        for (int i = 1; i <= t; i++) {
//            st = new StringTokenizer(br.readLine());
//            int a = Integer.parseInt(st.nextToken());
//            int b = Integer.parseInt(st.nextToken());
//
//            sb.append("Case #");
//            sb.append(String.format("%d: %d + %d = %d\n", i, a, b, a + b));
//        }
//        System.out.print(sb);
    }
}
