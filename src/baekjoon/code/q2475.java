package baekjoon.code;

import java.io.*;
import java.util.*;

public class q2475 {
    public static void main(String[] args) throws IOException {
        // 두번째 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            sum += Math.pow(Integer.parseInt(st.nextToken()), 2);
        }
        System.out.printf("%d", sum % 10);

//        // 첫번째 방법
//       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int c = Integer.parseInt(st.nextToken());
//        int d = Integer.parseInt(st.nextToken());
//        int e = Integer.parseInt(st.nextToken());
//
//        int sum = a*a + b*b + c*c + d*d + e*e;
//        System.out.printf("%d", sum % 10);
    }
}
