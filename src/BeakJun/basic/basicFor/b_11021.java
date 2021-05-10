package BeakJun.basic.basicFor;

import java.io.*;
import java.util.StringTokenizer;

public class b_11021 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken());
            bw.write("Case #" + i + ": " + A + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
