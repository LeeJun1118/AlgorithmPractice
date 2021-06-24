package BeakJun.basic.basicMath;

import java.io.*;
import java.util.StringTokenizer;

public class b_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int ho = 0;
            int floor = 0;

            //N이 H(최고층)보다 작다면
            if (N < H) {
                // 1호
                ho = 1;
                floor = N;
            } else {
                //층 구하기
                floor = N - (H * (N / H));
                //0이면 최상층
                if (floor == 0)
                    floor = H;

                //호 구하기
                if (N % H != 0)
                    ho = N / H + 1;
                else
                    ho = N/H;
            }

            //출력
            if (ho < 10)
                bw.write(floor + "0" + ho + "\n");
            else
                bw.write(floor + "" + ho + "\n");
        }
        bw.flush();
        bw.close();
    }
}
