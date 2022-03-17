package Programmers.level_1;

public class 콜라츠추측 {
    public static void main(String[] args) {

        System.out.println(solution(1));
    }

    public static int solution(int num) {
        int answer = 0;

        long result = num;
        if (result == 1)
            return 0;
        while (answer < 500) {
            if (result % 2 == 0) {
                result /= 2;
            } else {
                result = result * 3 + 1;
            }

            answer++;

            if (result == 1)
                break;
        }
        return answer == 500 ? -1 : answer;
    }
}
