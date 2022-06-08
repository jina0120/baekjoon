package solved.ac.class1;

import java.io.*;

public class Q2742 {
    public static void main(String[] args) throws IOException {
        // 두번째 풀이
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for (; n > 0; n--) {
            sb.append(n).append("\n");
        }
        System.out.print(sb);

//        // 첫번째 풀이
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(br.readLine());
//        for (;n > 0;n--) {
//            System.out.println(n);
//        }
    }
}
