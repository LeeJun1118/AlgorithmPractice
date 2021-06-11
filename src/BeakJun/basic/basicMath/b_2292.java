package BeakJun.basic.basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine());
        int rooms = 2;
        int count = 1;

        if (N == 1)
            System.out.print(1);
        else {
            while (rooms <= N) {
                rooms = rooms + 6 * count;
                count++;
            }
            System.out.print(count);
        }
    }
}
