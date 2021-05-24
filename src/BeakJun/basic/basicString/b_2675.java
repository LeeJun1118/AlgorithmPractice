package BeakJun.basic.basicString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(bufferedReader.readLine());

        for (int i = 0; i < T; i++) {
            String s = bufferedReader.readLine();
            String[] division = s.split(" ");
            int R = Integer.parseInt(division[0]);
            String[] num = division[1].split("");
            for (String value : num) {
                for (int k = 0; k < R; k++) {
                    System.out.print(value);
                }
            }
            System.out.println();
        }
    }
}
