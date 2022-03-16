package Programmers.level_1;

public class 평균구하기 {
    public static void main(String[] args) {

        int[] a = {5, 5};
        System.out.println(solution(a));

    }

    public static double solution(int[] arr) {
        double answer = 0;

        for (int i = 0; i < arr.length; i++) {
            answer = answer + arr[i];
        }
        return answer/arr.length;
    }
}
