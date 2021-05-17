package BeakJun.basic.basicArray;

import java.util.Scanner;

public class b_8958 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String[] ox = new String[N];
        int[] scoreArray = new int[N];

        int score = 0;
        int index = 0;

        for (int i = 0; i < N; i++) {
            ox[i] = scanner.next();
            String[] temp = ox[i].split("");
            for (String s : temp) {
                if (s.equals("O")) {
                    index++;
                    score = score + index;
                } else
                    index = 0;
            }
            scoreArray[i] = score;
            System.out.println(scoreArray[i]);
            score = 0;
            index = 0;
        }
    }
}
