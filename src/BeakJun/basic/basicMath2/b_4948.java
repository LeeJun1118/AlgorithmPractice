package BeakJun.basic.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_4948 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        boolean[] prime = new boolean[246913];

        //에라스토테네스 체
        prime[0] = prime[1] = true;
        for (int i = 2; i <= Math.sqrt(prime.length); i++) {
            for (int j = i*i; j < prime.length; j = j+i) {
                prime[j] = true;
            }
        }

        while (true){
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            if (n == 0)break;
            for (int i = n + 1; i <= 2*n; i++) {
                if (!prime[i]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
