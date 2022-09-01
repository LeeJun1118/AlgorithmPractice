package BeakJun.basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b_25305_커트라인 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] str = bf.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int k = Integer.parseInt(str[1]);

        String[] arr = bf.readLine().split(" ");
        int[] score = new int[N];

        for (int i = 0; i < arr.length; i++) {
            score[i] = Integer.parseInt(arr[i]);
        }

        Arrays.sort(score);

        int result = score[N - k];
        System.out.println(result);

    }
}
