package BeakJun.basic.basicArray;

import java.util.Scanner;

public class b_4344 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int C = scanner.nextInt();
        double[] average = new double[C];

        for (int i = 0; i < C; i++) {
            double countScore = 0;
            int sum = 0;
            int N = scanner.nextInt();
            int[] score = new int[N];

            for (int j = 0; j < N; j++) {
                score[j] = scanner.nextInt();
                sum += score[j];
            }
            int avg = sum / N;

            for (int j : score) {
                if (j > avg)
                    countScore++;
            }
            average[i] = countScore / N * 100;
        }
        for (double d : average) {
            String result = String.format("%.3f", d);
            System.out.println(result + "%");
        }
    }
}
