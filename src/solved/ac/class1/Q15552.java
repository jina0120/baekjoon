package solved.ac.class1;

import java.io.*;
import java.util.*;

public class Q15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            // sb에 a+b 더하고 "\n" 더해준다.
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }
        System.out.print(sb);
    }
}
