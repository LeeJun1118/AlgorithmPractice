package BeakJun.basic.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1018_chess {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");

        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        boolean[][] arr = new boolean[N][M];
        int min = 64;

        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            for (int j = 0; j < M; j++) {
                //B이면 false
                if (s.charAt(j) == 'B') {
                    arr[i][j] = false;
                }
                //W이면 true
                else {
                    arr[i][j] = true;
                }
            }
        }

        // 경우의 수
        int x = N - 7;
        int y = M - 7;

        for (int i = 0; i < x; i++) {
            for (int j = 0; j < y; j++) {
                boolean tf = arr[i][j];
                int count = 0;

                int endX = i + 8;
                int endY = j + 8;

                for (int k = i; k < endX; k++) {
                    for (int h = j; h < endY; h++) {
                        if (arr[k][h] != tf) {
                            count++;
                        }
                        tf = !tf;
                    }
                    tf = !tf;
                }
                // B,W 둘 중에 가장 적은 소요
                count = Math.min(count, 64 - count);

                // 최소치 찾기
                min = Math.min(min,count);
            }
        }

        System.out.println(min);
    }
}
