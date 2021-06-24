package BeakJun.basic.basicMath;

import java.io.*;

public class b_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        int[][] apt = new int[15][15];

        //0층 : 1 2 3 4 5호 ~
        //0호 : 1
        for (int j = 0; j < 15; j++) {
            apt[j][0] = 1; //j층 0호
            apt[0][j] = j + 1; //0층 j호
        }

        for (int j = 1; j < 15; j++) {
            for (int l = 1; l < 15; l++) {
                apt[j][l] = apt[j][l - 1] + apt[j - 1][l];
            }
        }
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            System.out.println(apt[k][n-1]);
        }
    }
}
