package BeakJun.basic.basicFor;

import java.util.Scanner;

public class b_10950 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        int A,B;
        for (int i = 0; i < T; i++) {
            A = scanner.nextInt();
            B = scanner.nextInt();
            System.out.println(A+B);
        }
    }
}
