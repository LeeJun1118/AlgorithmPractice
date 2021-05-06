package BeakJun.basic.basicIf;

import java.util.Scanner;

public class b_2884 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int H = scanner.nextInt();
        int M = scanner.nextInt();

        if (M >= 45)
            M = M - 45;
        else {
            M = M + 15;
            H = H -1;
            if (H < 0)
                H = H + 24;
        }
        System.out.print(H + " " + M);
    }
}
