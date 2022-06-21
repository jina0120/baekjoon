package baekjoon.code;

import java.io.*;
import java.util.*;

public class Q10807 {
    public static void main(String[] args) throws IOException{
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
//        int v = Integer.parseInt(br.readLine());
//
//        int count = 0;
//        for (int i = 0; i < n; i++) {
//            if (v == Integer.parseInt(st.nextToken())) {
//                count++;
//            }
//        }
//        System.out.println(count);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[Integer.parseInt(br.readLine())];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int v = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i : arr) {
            if(i == v) {
                count++;
            }
        }
        System.out.print(count);
    }
}
