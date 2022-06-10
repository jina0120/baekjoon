package solved.ac.class1;

import java.io.*;
import java.util.*;

public class Q11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= t; i++) {
            st = new StringTokenizer(br.readLine());
            sb.append("Case #").append(i).append(": ");
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }
        System.out.print(sb);
    }
}
