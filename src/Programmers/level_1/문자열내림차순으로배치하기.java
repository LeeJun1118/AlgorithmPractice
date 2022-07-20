package Programmers.level_1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {
        solution("abcdABCDabZ");
    }

    public static String solution(String s) {
        String answer = "";

        char[] str = s.toCharArray();
        Arrays.sort(str);

        return new StringBuilder(new String(str)).reverse().toString();
    }
}
