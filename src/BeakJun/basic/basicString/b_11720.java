package BeakJun.basic.basicString;

import java.util.Scanner;

public class b_11720 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.nextLine();

        String num = scanner.nextLine();
        String[] sp = num.split("");

        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += Integer.parseInt(sp[i]);
        }
        System.out.println(sum);
    }
}