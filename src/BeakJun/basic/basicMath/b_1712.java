package BeakJun.basic.basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1712 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer token = new StringTokenizer(bufferedReader.readLine());

        int A = Integer.parseInt(token.nextToken());
        int B = Integer.parseInt(token.nextToken());
        int C = Integer.parseInt(token.nextToken());

        if (C-B < 0)
            System.out.println("-1");
        else
            System.out.println(A/(C-B)+1);
    }
}
