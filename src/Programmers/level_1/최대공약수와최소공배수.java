package Programmers.level_1;

import java.util.Arrays;

public class 최대공약수와최소공배수 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2,5)));
    }

    public static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int big = n;
        int small = m;
        if (n < m) {
            big = m;
            small = n;
        }

        int temp;
        while (small != 0) {
            temp = big % small;
            big = small;
            small = temp;
        }
        answer[0] = big;
        answer[1] = n*m/big;

        return answer;
    }
}
