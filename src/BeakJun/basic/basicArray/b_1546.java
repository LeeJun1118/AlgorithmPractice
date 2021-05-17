package BeakJun.basic.basicArray;

import java.util.Arrays;
import java.util.Scanner;

public class b_1546 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        double[] score = new double[N];
        double sum = 0;

        for (int i = 0; i < N; i++) {
            score[i] = scanner.nextInt();
        }

        Arrays.sort(score);

        for (int i = 0; i < N; i++) {
            score[i] = score[i] / score[score.length - 1] * 100;
        }

        for (int i = 0; i < N; i++) {
            sum = sum + score[i];
        }
        System.out.println(sum / N);
    }
}
