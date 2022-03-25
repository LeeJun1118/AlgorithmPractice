package Programmers.level_1;

import java.util.Arrays;

public class 자연수를뒤집어배열로만들기 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(12345)));
    }

    public static int[] solution(long n) {
        int[] answer = {};

        int i = 0;
        answer = new int[("" + n).split("").length];
        while (n > 0) {
            answer[i++] = (int) (n % 10);
            n /= 10;
        }

        return answer;
    }
}
