package baekjoon.code;

import java.io.*;
import java.util.*;

public class Q2869 {
    public static void main(String[] args) throws IOException {
        // 두번째 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());

        int days = 1 + ((v - a) / (a - b));
        if ((v - a) % (a - b) > 0) {
            days += 1;
        }
        System.out.print(days);

//        // 첫번째 풀이 (시간 초과)
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int a = Integer.parseInt(st.nextToken());
//        int b = Integer.parseInt(st.nextToken());
//        int v = Integer.parseInt(st.nextToken());
//
//        int result = 0;
//        int count = 0;
//        while(result < v) {
//            count++;
//            result += a;
//            if (result >= v) {
//                break;
//            }
//            result -= b;
//        }
//        System.out.print(count);
    }
}
