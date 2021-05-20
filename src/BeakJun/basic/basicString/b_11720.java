package BeakJun.basic.basicString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int sum = 0;

        for (int i = 0; i < N; i++) {
            char c = (char) br.read();
            int j = c;
            sum = sum + c;
        }


        /*for (int i = 0; i < s.split("").length; i++) {
            String[] c = s.split("");
            sum = sum + Integer.parseInt(c[i]);
        }
*/
        br.close();
        System.out.println(sum);
    }
}
