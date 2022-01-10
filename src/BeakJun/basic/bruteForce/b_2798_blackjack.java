package BeakJun.basic.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2798_blackjack {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] t = br.readLine().split(" ");
        int N = Integer.parseInt(t[0]);
        int M = Integer.parseInt(t[1]);
        int[] numbers = new int[N];

        String[] s = br.readLine().split(" ");
        int temp,result = 0;

        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(s[i]);
        }

        for (int i = 0; i < numbers.length - 2; i++) {
            for (int j = i + 1; j < numbers.length - 1; j++) {
                for (int k = j + 1; k < numbers.length; k++) {
                    temp = numbers[i] + numbers[j] + numbers[k];

                    if (temp <= M && temp >= result)
                        result = temp;
                }
            }
        }
        System.out.println(result);
    }
}
