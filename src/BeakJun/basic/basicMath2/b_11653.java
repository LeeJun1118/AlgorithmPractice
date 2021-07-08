package BeakJun.basic.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_11653 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int num = N;
        if (N != 1) {
            //2부터 N-1까지 반복
            for (int i = 2; i <= num; i++) {
                //2부터 N-1까지 반복
                for (int j = 2; j <= N; j++) {
                    // N / 2부터 N-1까지 하는데 나머지가 0이라면
                    if (N % j == 0) {
                        System.out.println(j);
                        N = N / j;// N/i를 N으로 변경
                        break;
                    }
                }
            }
        }
    }
}
