package BeakJun.basic.basicWhile;

import java.util.Scanner;

public class b_1110 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int N = scanner.nextInt();
        int cycle = 0;

        //조건
        if (N >= 0 && N < 100) {
            int newNum = N;

            while (true) {
                int ten = newNum / 10;
                //1의 자리 수 추출
                int one = newNum % 10;

                //10의 자리 + 1의 자리 수/
                int m = ten + one;
                if (m >= 10)
                    m = m % 10;

                //1의 자리수 * 10 + 중간 수
                newNum = one * 10 + m;

                cycle++;
                if (newNum == N) break;
            }
        }
        System.out.println(cycle);
    }
}
