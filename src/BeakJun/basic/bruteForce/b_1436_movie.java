package BeakJun.basic.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1436_movie {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int num = 666;
        int count = 0;
        while (N != count) {
            if (String.valueOf(num).contains("666"))
                count++;
            num++;
        }
        num--;
        System.out.println(num);
    }
}
