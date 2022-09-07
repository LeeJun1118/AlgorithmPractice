package BeakJun.basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2751_수정렬하기2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bf.readLine());

        boolean[] arr = new boolean[2000001];

        int num;
        int max = -1;
        for (int i = 0; i < N; i++) {
            num = Integer.parseInt(bf.readLine()) + 1000000;
            max = Math.max(num, max);
            arr[num] = true;
            max = Math.max(num, max);
        }
        bf.close();

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= max; i++) {
            if (arr[i]) {
                sb.append(i - 1000000).append('\n');
            }
        }

        System.out.println(sb);
    }
}
