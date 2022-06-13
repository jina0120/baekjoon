package baekjoon.code;

import java.io.*;

public class q2439 {
    public static void main(String[] args) throws IOException {
        // 두번째 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = Integer.parseInt(br.readLine());
        for (int i = 1; i <= n; i++) {
            for (int j = n - i; j > 0; j--) {
                sb.append(" ");
            }
            for (int k = i; k > 0; k--) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.print(sb);

//        // 첫번째 풀이
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        for (int i = 1; i <= n; i++) {
//            for (int j = n - i; j >= 0; j--) {
//                System.out.print(" ");
//            }
//            for (int k = i; k > 0; k--) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
    }
}
