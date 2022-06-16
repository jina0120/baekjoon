package baekjoon.code;

import java.io.*;

public class Q5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] arr = br.readLine().toCharArray();

        int seconds = 0;
        for (int i = 0; i < arr.length; i++) {
            switch(arr[i]) {
                case 'A': case 'B': case 'C':
                    seconds += 3;
                    break;
                case 'D': case 'E': case 'F':
                    seconds += 4;
                    break;
                case 'G': case 'H': case 'I':
                    seconds += 5;
                    break;
                case 'J': case 'K': case 'L':
                    seconds += 6;
                    break;
                case 'M': case 'N': case 'O':
                    seconds += 7;
                    break;
                case 'P': case 'Q': case 'R': case 'S':
                    seconds += 8;
                    break;
                case 'T': case 'U': case 'V':
                    seconds += 9;
                    break;
                case 'W': case 'X': case 'Y': case 'Z':
                    seconds += 10;
                    break;
            }
        }
        System.out.print(seconds);
    }
}
