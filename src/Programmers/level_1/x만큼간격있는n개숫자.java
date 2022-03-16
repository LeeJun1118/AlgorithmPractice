package Programmers.level_1;

import java.util.Arrays;

public class x만큼간격있는n개숫자 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2,5)));
    }

    public static long[] solution(int x, int n) {
        long[] answer = {};

        answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++) {
            answer[i] = answer[i - 1] + x;
        }

        return answer;
    }
}
