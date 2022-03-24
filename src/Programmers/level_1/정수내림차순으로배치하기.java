package Programmers.level_1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public static void main(String[] args) {
        System.out.println(solution(118372));
    }

    public static long solution(long n) {
        long answer = 0;

        String[] strArray = ("" + n).split("");
        Arrays.sort(strArray);

        String temp = "";
        for (int i = strArray.length - 1; i >= 0; i--) {
            temp = temp + strArray[i];
        }

        answer = Long.parseLong(temp);
        return answer;
    }
}
