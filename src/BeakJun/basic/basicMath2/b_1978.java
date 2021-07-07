package BeakJun.basic.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int count = 0;
        String st = br.readLine();
        String[] str = st.split(" ");

        for (String s : str) {
            int num = Integer.parseInt(s);
            boolean isPrime = true;
            if (num == 1) {
                continue;
            } else if (num == 2) {
                count++;
                continue;
            } else {
                for (int j = 2; j < num; j++) {
                    if (num % j == 0) {
                        isPrime = false;
                    }
                }
            }
            if (isPrime)
                count++;
        }
        System.out.println(count);
    }
}
