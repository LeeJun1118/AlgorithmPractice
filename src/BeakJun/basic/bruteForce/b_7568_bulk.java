package BeakJun.basic.bruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class b_7568_bulk {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Map<Integer, int[]> per = new HashMap();
        int result;

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            int[] temp = new int[2];
            temp[0] = Integer.parseInt(str[0]);
            temp[1] = Integer.parseInt(str[1]);
            per.put(i, temp);
        }

        for (int i = 0; i < N; i++) {
            result = 1;
            for (int j = 0; j < N; j++) {
                if (i == j) {
                    continue;
                } else {
                    if (per.get(i)[0] < per.get(j)[0] && per.get(i)[1] < per.get(j)[1]) {
                        result++;
                    }
                }
            }
            System.out.println(result);
        }
    }
}
