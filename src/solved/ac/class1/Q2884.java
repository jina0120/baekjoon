package solved.ac.class1;

import java.io.*;
import java.util.*;

public class Q2884 {
    public static void main(String[] args) throws IOException {
        // 리팩토링
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken()) - 45;

        if (m < 0) {
            m += 60;
            h = h == 0 ? 23 : h-1;
        }

        StringBuilder sb = new StringBuilder();
        sb.append(h).append(" ").append(m);
        System.out.println(sb);

//        // 첫번째 풀이
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        StringTokenizer st = new StringTokenizer(br.readLine());
//
//        int h = Integer.parseInt(st.nextToken());
//        int m = Integer.parseInt(st.nextToken());
//        // 입력받은 분에서 - 45가 음수라면
//        if (m - 45 < 0) {
//            // 60 - 45 + m
//            m = 15 + m;
//            // 입력받은 시가 0이라면 23, 아니라면 h-1
//            h = h == 0 ? 23 : h-1;
//        } else {
//            m -= 45;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        sb.append(h).append(" ").append(m);
//        System.out.println(sb);
    }
}
