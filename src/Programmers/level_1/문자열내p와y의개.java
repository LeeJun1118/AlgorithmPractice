package Programmers.level_1;

public class 문자열내p와y의개 {
    public static void main(String[] args) {
        System.out.println(solution("Pyy"));
    }

    public static boolean solution(String s) {
        s = s.toLowerCase();
        char[] chArr = s.toCharArray();

        int cnt = 0;
        for (int i = 0; i < chArr.length; i++) {
            if (chArr[i] == 'p') cnt++;
            if (chArr[i] == 'y') cnt--;
        }
        return cnt == 0;
    }
}