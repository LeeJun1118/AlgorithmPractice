package Programmers.level_1;

public class 하샤드수 {
    public static void main(String[] args) {

        System.out.println(solution(13));
    }

    public static boolean solution(int x) {
        boolean answer = true;

        int param = x;
        int temp = 0;
        while (param > 0) {
            temp = temp + param % 10;
            param = param / 10;
        }

        if (x % temp != 0) {
            answer = false;
        }

        return answer;
    }

}
