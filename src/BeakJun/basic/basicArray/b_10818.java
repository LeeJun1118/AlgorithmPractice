package BeakJun.basic.basicArray;

import java.util.Arrays;
import java.util.Scanner;

public class b_10818 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }
        int min = Arrays.stream(array).min().getAsInt();
        int max = Arrays.stream(array).max().getAsInt();

        System.out.println(min + " " + max);
    }
}
