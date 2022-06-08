package solved.ac.class1;

import java.io.*;
import java.util.*;

public class Q10430 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        sb.append((a+b) % c).append("\n");
        sb.append((a%c + b%c) % c).append("\n");
        sb.append((a*b) % c).append("\n");
        sb.append(((a%c) * (b%c)) % c).append("\n");
        System.out.print(sb);
    }
}
