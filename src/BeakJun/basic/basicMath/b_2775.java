package BeakJun.basic.basicMath;

import java.io.*;
import java.util.Arrays;

public class b_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] apt = new int[15][15];

        //1행 : 1 2 3 4 5 ~
        for (int j = 0; j < 15; j++) {
            apt[0][j] = j;
            apt[j][1] = 1;
        }

        for (int j = 1; j < 15; j++) {
            for (int l = 2; l < 15; l++) {
                apt[j][l] = apt[j][l - 1] + apt[j - 1][l];
            }
        }
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apt[k][n]);
        }
        System.out.println(Arrays.deepToString(apt));
    }

}
