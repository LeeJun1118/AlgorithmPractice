package BeakJun.basic.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2581 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int sum = 0;
        int min = N;
        for (int i = M; i <= N; i++) {
            boolean isPrime = true;
            if (i == 1) {
            }
            else if (i == 2) {
                sum += i;
                min = i;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    sum += i;
                    if (min > i)
                        min = i;
                }
            }
        }
        if (sum == 0)
            System.out.println(-1);
        else {
            System.out.println(sum);
            System.out.println(min);
        }
    }
}
