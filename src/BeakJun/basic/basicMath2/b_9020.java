package BeakJun.basic.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_9020 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int n = Integer.parseInt(br.readLine());
            boolean[] prime = new boolean[n+1];
            int a = n/2;
            int b = n/2;

            //에라스토테네스 체
            prime[0] = prime[1] = true;
            for (int j = 2; j < Math.sqrt(n); j++) {
                for (int k = j*j; k <= n; k = k + j) {
                    prime[k] = true;
                }
            }
            while (true){
                if (!prime[a] && !prime[b]){
                    System.out.println(a+" "+b);
                    break;
                }
                a--;
                b++;
            }

        }
    }
}
