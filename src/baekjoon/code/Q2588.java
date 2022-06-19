package baekjoon.code;

import java.io.*;

public class Q2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        int b = Integer.parseInt(br.readLine());

        int u = a * (b % 10);
        int t = a * ((b / 10) % 10);
        int h = a * (b / 100);

        StringBuilder sb = new StringBuilder();
        sb.append(u).append("\n");
        sb.append(t).append("\n");
        sb.append(h).append("\n");
        sb.append((h * 100) + (t * 10) + u);
        System.out.print(sb);
    }
}
