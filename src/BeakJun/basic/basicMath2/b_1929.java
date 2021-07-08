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

        //M과 N 사이
        for (int i = M; i <= N; i++) {
            boolean isPrime = true;
            if (i <= 1) {
            } else if (i == 2) {
                System.out.println(2);
                continue;
            } else {
                for (int j = 2; j <= i/2 + 1; j++) {
                    if (i % j == 0){
                        isPrime = false;
                    }
                }
                if (isPrime)
                    System.out.println(i);
            }
        }
    }
}
