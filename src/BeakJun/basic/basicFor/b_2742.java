package BeakJun.basic.basicFor;

import java.io.*;

public class b_2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        br.close();

        for (int i = N; i > 0; i--) {
            bw.write(i + "\n");
        }
        bw.flush();
        bw.close();
    }
}
