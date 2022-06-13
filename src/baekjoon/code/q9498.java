package baekjoon.code;

import java.io.*;

public class q9498 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int x = Integer.parseInt(br.readLine());

        if (x <= 100 && x >= 90) {
            System.out.print("A");
        } else if (x >= 80) {
            System.out.print("B");
        } else if (x >= 70) {
            System.out.print("C");
        } else if (x >= 60) {
            System.out.print("D");
        } else {
            System.out.print("F");
        }
    }
}
