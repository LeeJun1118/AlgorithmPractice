package BeakJun.basic.basicMath;

import java.io.*;
import java.util.StringTokenizer;

public class b_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer token = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        int V = Integer.parseInt(token.nextToken());

        double day = (double) (V - A) / (A - B);
        int total = (int)Math.ceil(day) + 1;

        bw.write(total + "");
        bw.flush();
        bw.close();
    }
}
