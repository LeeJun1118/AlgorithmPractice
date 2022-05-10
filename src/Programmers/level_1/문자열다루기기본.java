package Programmers.level_1;

public class 문자열다루기기본 {
    public static void main(String[] args) {
        solution("234");
    }

    public static boolean solution(String s) {
        boolean answer = true;

        if (s.length() == 4 || s.length() == 6) {
            try {
                int i = Integer.parseInt(s);
            } catch (Exception e) {
                answer = false;
            }
        } else {
            answer = false;
        }
        return answer;
    }
}
