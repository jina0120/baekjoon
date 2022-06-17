package baekjoon.code;

import java.io.*;

public class Q2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int max = Integer.MIN_VALUE;
        int[] arr = new int[9];
        for (int i = 0; i < 9; i++) {
            int x = Integer.parseInt(br.readLine());
            arr[i] = x;
            if (x > max) {
                max = x;
            }
        }

        int count = 0;
        for (int i = 0; i < 9; i++) {
            count++;
            if (arr[i] == max) {
                break;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(max).append("\n").append(count);
        System.out.print(sb);
    }
}
