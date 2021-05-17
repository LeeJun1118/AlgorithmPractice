package BeakJun.basic.basicArray;

import java.util.Scanner;

public class b_2562 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] N = new int[9];

        int max = 0;
        int index = 0;

        for (int i = 0; i < N.length; i++) {
            N[i] = scanner.nextInt();

        }

        for (int i = 0; i < N.length; i++) {
            if (max < N[i]){
                max = N[i];
                index = i;
            }
        }
        System.out.println(max);
        System.out.println(index + 1);
    }
}
