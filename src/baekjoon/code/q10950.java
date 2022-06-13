package baekjoon.code;

import java.io.*;
import java.util.*;

public class q10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        // StringTokenizer 전역 변수 생성
        StringTokenizer st;
        // 결과를 출력할 스트링빌더 생성
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            // 입력받고 공백을 기준으로 쪼개서 int를 받아준다.
            st = new StringTokenizer(br.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            // 결과 빌더에 저장
            sb.append(a + b).append("\n");
        }
        // 출력
        System.out.print(sb);
    }
}
