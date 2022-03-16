package Programmers.level_1;

public class 핸드폰번호가리기 {
    public static void main(String[] args) {

        System.out.println(solution("1239847"));
    }

    public static String solution(String phone_number) {
        String answer = "";

        int len = phone_number.length() - 4;
        String open = phone_number.substring(len);

        for (int i = 0; i < len; i++) {
            answer = answer + "*";
        }
        answer = answer + open;

        return answer;
    }
}
