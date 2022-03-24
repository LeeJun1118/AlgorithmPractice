package Programmers.level_1;

public class 정수제곱근판별 {
    public static void main(String[] args) {
        System.out.println(solution(121));
    }

    public static long solution(long n) {

        return Math.sqrt(n) % 1 == 0 ? (long) Math.pow(Math.sqrt(n) + 1, 2) : -1;
    }
}
