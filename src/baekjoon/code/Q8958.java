package baekjoon.code;

import java.io.*;

public class Q8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < t; i++) {
            String[] s = br.readLine().split("");
            int x = 0;
            int sum = 0;
            for (int j = 0; j < s.length; j++) {
                if (s[j].equals("O")) {
                    x++;
                } else {
                    x = 0;
                }
                sum += x;
            }
            sb.append(sum).append("\n");
        }
        System.out.print(sb);
    }
}
