package Programmers.level_1;

import java.util.Locale;

public class 이상한문자만들기 {
    public static void main(String[] args) {
        System.out.println(solution("try   hello world"));
    }

    public static String solution(String s) {
        String answer = "";

        String[] strArr = s.split("");
        int cnt = 0;
        for (String str : strArr) {
            cnt = str.contains(" ") ? 0 : ++cnt;//후위연산자는 계산이 안된다
            answer += cnt % 2 == 0 ? str.toLowerCase() : str.toUpperCase();
        }

        return answer;
    }
}
