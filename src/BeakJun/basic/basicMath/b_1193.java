package BeakJun.basic.basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1193 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int sub = 1;

        while (N > sub) {
            N = N - sub;
            sub++;
        }

        if (sub % 2 != 0) {
            //홀수
            //분자 감소, 분모 증가
            System.out.println((sub - N + 1) + "/" + N);
        } else {
            //짝수
            //분모 감소, 분자 증가
            sub = sub - N + 1; //분모

            System.out.println(N + "/" + sub);
        }

    }
}
