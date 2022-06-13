package baekjoon.code;

import java.io.*;

public class Q10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        String[] arr = s.split(" ");

        int max = Integer.parseInt(arr[0]);
        int min = Integer.parseInt(arr[0]);
        for (int i = 0; i < arr.length; i++) {
            int x = Integer.parseInt(arr[i]);
            if (x > max) {
                max = x;
            }
            if (x < min) {
                min = x;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(min).append(" ").append(max);
        System.out.print(sb);
    }
}
