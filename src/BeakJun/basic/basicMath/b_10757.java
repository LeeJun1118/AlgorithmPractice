package BeakJun.basic.basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10757 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String[] A = str[0].split("");
        String[] B = str[1].split("");

        int zero = 0;
        String sum = "";
        int loop = 0;
        loop = Math.min(A.length, B.length);

        for (int i = 1; i <= loop; i++) {
            int s = Integer.parseInt(A[A.length - i]) + Integer.parseInt(B[B.length - i]) + zero;
            if (s >= 10)
                zero = 1;
            else zero = 0;
            sum = s % 10 + sum;
        }

        if (A.length > B.length) {
            for (int i = 1; i <= A.length - B.length; i++) {
                int s = Integer.parseInt(A[A.length - B.length - i]) + zero;
                if (s >= 10)
                    zero = 1;
                else zero = 0;
                sum = s % 10 + sum;
            }
        } else if (B.length > A.length) {
            for (int i = 1; i <= B.length - A.length; i++) {
                int s = Integer.parseInt(B[B.length - A.length - i]) + zero;
                if (s >= 10)
                    zero = 1;
                else zero = 0;
                sum = s % 10 + sum;
            }
        }

        if (zero == 1)
            sum = 1 + sum;

        System.out.print(sum);
    }
}
