package BeakJun.basic.io;

import java.util.Scanner;

public class b_2588 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();

        System.out.println(A*(B%10));
        System.out.println(A*(B/10%10));
        System.out.println(A*(B/100%10));
        System.out.println(A*B);
    }
}
