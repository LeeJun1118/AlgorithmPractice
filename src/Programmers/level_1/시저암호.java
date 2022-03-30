package Programmers.level_1;

public class 시저암호 {
    public static void main(String[] args) {
        System.out.println(solution("a B z", 1));
    }
    public static String solution(String s, int n) {
        String answer = "";

        String[] arr = s.split("");
        int num;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i].equals(" ")) {
                answer += " ";
                continue;
            }

            num = arr[i].charAt(0);
            if (65 <= num && num <= 90 && 90 < num + n) {
                answer += (char) (num + n - 26);
            } else if (90 <= num && num <= 122 && 122 < num + n) {
                answer += (char) (num + n - 26);
            } else {
                answer += (char) (num + n);
            }

        }

        return answer;
    }
}
