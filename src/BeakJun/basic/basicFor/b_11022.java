package BeakJun.basic.basicFor;

import java.io.*;
import java.util.StringTokenizer;

public class b_11022 {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int C = A + B;

            bw.write("Case #" + i + ": " + A + " + " + B + " = " + C + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
