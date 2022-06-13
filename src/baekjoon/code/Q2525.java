package baekjoon.code;

import java.io.*;
import java.util.*;

public class Q2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(br.readLine()) + b;

        b = (c%60);
        a += (c/60);
        if (a > 23) {
            a -= 24;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(" ").append(b);
        System.out.print(sb);
    }
}
