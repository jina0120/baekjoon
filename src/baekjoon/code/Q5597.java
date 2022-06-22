package baekjoon.code;

import java.io.*;

public class Q5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] all = new int[30];
        int i = 0;
        while (i < 28) {
            int x = Integer.parseInt(br.readLine());
            all[x-1] = x;
            i++;
        }

        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < all.length; j++) {
            if(all[j] == 0) {
                sb.append(j+1).append("\n");
            }
        }
        System.out.print(sb);
    }
}
