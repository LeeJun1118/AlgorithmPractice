package BeakJun.basic.basicFunction;

import java.util.Scanner;

public class b_1065 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        System.out.println(hansu(N));
    }

    static int hansu(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++)
            if (i < 100)
                count++;
            else if (i < 1000 && (i % 10 - i / 10 % 10) == (i / 10 % 10 - i / 100 % 10)) {
                count++;
            }
        return count;
    }
}
