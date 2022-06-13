package baekjoon.code;

import java.io.*;

public class q2739 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        for(int i = 1; i <= 9; i++) {
            System.out.printf("%d * %d = %d", n, i, n * i).println();
        }
    }
}
