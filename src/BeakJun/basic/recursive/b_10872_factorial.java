package BeakJun.basic.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_10872_factorial {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(bufferedReader.readLine());

        System.out.println(recursive(n));
    }
    public static long recursive(long n){
        if (n == 0)
            return 1;
        else {
            return n * recursive(n - 1);
        }
    }
}
