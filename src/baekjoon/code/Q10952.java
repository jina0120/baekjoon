package baekjoon.code;

import java.io.*;
import java.util.*;

public class Q10952 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a;
        int b;
        StringBuilder sb = new StringBuilder();
        do {
            StringTokenizer st = new StringTokenizer(br.readLine());
            a = Integer.parseInt(st.nextToken());
            b = Integer.parseInt(st.nextToken());
            if (a != 0 && b != 0) {
                sb.append(a + b).append("\n");
            }
        } while (a != 0 && b != 0);
        System.out.print(sb);
    }
}
