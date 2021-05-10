package BeakJun.basic.basicFor;

import java.util.Scanner;

public class b_10871 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int X = scanner.nextInt();

        for (int i = 0; i < N; i++) {
            int a = scanner.nextInt();
            if (a < X)
                System.out.print(a + " ");
        }
    }
}
