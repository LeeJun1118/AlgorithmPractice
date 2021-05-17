package BeakJun.basic.basicArray;

import java.util.Scanner;

public class b_3052 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[42];
        int count = 0;

        for (int i = 0; i < 10; i++) {
            int index = scanner.nextInt()%42;
            num[index]++;
        }

        for (int j : num)
            if (j != 0)
                count++;

        System.out.println(count);
    }
}
