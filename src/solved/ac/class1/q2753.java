package solved.ac.class1;

import java.io.*;

public class q2753 {
    public static void main(String[] args) throws IOException {
        // 두번째 방법
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int year = Integer.parseInt(br.readLine());

        String result = year % 4 == 0 && (year % 100 != 0 || year % 400 == 0) ? "1" : "0";
        System.out.println(result);

//        // 첫번째 방법
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//        int year = Integer.parseInt(br.readLine());
//
//        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
//            System.out.print("1");
//        } else {
//            System.out.print("0");
//        }
    }
}
