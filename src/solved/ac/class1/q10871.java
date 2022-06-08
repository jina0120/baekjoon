package solved.ac.class1;

import java.io.*;
import java.util.*;

public class q10871 {
    public static void main(String[] args) throws IOException {
        // 두번째 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        // 정수 N개
        int n = Integer.parseInt(st.nextToken());
        // 기준 X
        int x = Integer.parseInt(st.nextToken());
        // 스트링토크나이저 초기화 후 " "기준으로 입력받기
        st = new StringTokenizer(br.readLine(), " ");

        // 출력값 담을 스트링빌더 생성
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            // st안의 요소 하나씩 int로 가져오기
            int num = Integer.parseInt(st.nextToken());
            // 판별
            if (num < x) {
                sb.append(num).append(" ");
            }
        }
        System.out.print(sb);

//        // 첫번째 풀이
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//        StringBuilder sb = new StringBuilder();
//
//        int n = Integer.parseInt(st.nextToken());
//        int x = Integer.parseInt(st.nextToken());
//        String str = br.readLine();
//        String[] strArr = str.split(" ");
//
//        int[] intArr = new int[strArr.length];
//        for (int i = 0; i < strArr.length; i++) {
//            intArr[i] = Integer.parseInt(strArr[i]);
//        }
//
//        for (int i = 0; i < n; i++) {
//            if (intArr[i] < x) {
//                sb.append(intArr[i]).append(" ");
//            }
//        }
//        System.out.println(sb);
    }
}
