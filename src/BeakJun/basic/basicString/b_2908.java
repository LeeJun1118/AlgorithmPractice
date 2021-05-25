package BeakJun.basic.basicString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        bufferedReader.close();
        String[] st = s.split(" ");

        int[] compare = new int[st.length];

        for (int i = 0; i < st.length; i++) {
            int k1 = Integer.parseInt(st[i]);
            compare[i] = k1 % 10 * 100 + k1 / 10 % 10 * 10 + k1 / 100 % 10;
        }
        System.out.println(Math.max(compare[0], compare[1]));
    }
}
