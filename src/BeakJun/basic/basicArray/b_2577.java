package BeakJun.basic.basicArray;

import java.util.Scanner;

public class b_2577 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] num = new int[10];
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int sum = A*B*C;
        while (sum > 0){
            int index = sum % 10;
            num[index]++;
            sum/=10;
        }
        for (int i : num) {
            System.out.println(i);
        }
    }
}
