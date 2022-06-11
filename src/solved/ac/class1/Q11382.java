package solved.ac.class1;

import java.io.*;
import java.util.*;

public class Q11382 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append(Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()) + Long.parseLong(st.nextToken()));
        System.out.print(sb);
    }
}
