package BeakJun.basic.basicMath;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1011_flyMeToTheAlphaCentauri {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader location;
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            int result = 0;

            location = new BufferedReader(new InputStreamReader(System.in));
            String[] s = location.readLine().split(" ");
            int x = Integer.parseInt(s[0]);
            int y = Integer.parseInt(s[1]);
            int distance = y - x;




            System.out.println(result);
        }
    }
}
