package baekjoon.code;

import java.io.*;
import java.util.*;

public class Q2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        long result = Long.parseLong(st.nextToken()) - Long.parseLong(st.nextToken());
        if (result < 0) {
            result = result * (-1);
        }
        System.out.print(result);
    }
}
