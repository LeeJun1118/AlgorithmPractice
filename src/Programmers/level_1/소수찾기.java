package Programmers.level_1;

public class 소수찾기 {
    public static void main(String[] args) {
        System.out.println(solution(5));
    }

    public static int solution(int n) {
        int answer = 0;

        int[] arr = new int[n + 1];

        arr[0] = 1;
        arr[1] = 1;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == 1) {
                continue;
            }
            for (int j = i*2; j < arr.length; j+=i) {
                arr[j] = 1;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                answer++;
            }
        }

        return answer;
    }
}
