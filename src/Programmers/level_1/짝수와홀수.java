package Programmers.level_1;

public class 짝수와홀수 {
    public static void main(String[] args) {

        System.out.println(solution(10));
    }

    public static String solution(int num) {
        String answer = "";
        return num % 2 == 0 ? "Even" : "Odd";
    }

}
