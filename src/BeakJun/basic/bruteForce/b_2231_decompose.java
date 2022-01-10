package BeakJun.basic.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2231_decompose {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int result, i = 0;

        while (true) {
            result = 0;
            String[] str = ("" + i).split("");
            for (int j = 0; j < str.length; j++) {
                result = result + Integer.parseInt(str[j]);
            }
            result = result + i;
            if (result == N) {
                System.out.println(i);
                break;
            }
            i++;
            if (i >= N) {
                System.out.println(0);
                break;
            }
        }
    }
}
