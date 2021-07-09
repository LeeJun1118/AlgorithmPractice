package BeakJun.basic.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1929 {
    public static void main(String[] args) throws IOException {
        //두 숫자 입력 받기
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine();
        String[] str = st.split(" ");
        int M = Integer.parseInt(str[0]);
        int N = Integer.parseInt(str[1]);

        boolean[] prime = new boolean[N + 1];

        prime[0] = prime[1] = true;

        //N의 제곱근까지
        for (int i = 2; i <= Math.sqrt(N); i++) {
            //제곱근보다 작은 수들의 배수들을 true로 바꿈
            for (int j = i * i; j <= N; j = j + i) {
                prime[j] = true;
            }
        }

        //false인 것들 찾아 인덱스 출력
        for (int i = M; i < prime.length; i++) {
            if (!prime[i])
                System.out.println(i);
        }
    }
}
