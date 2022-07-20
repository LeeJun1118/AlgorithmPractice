package Programmers.level_1;

public class 서울에서김서방찾기 {
    public static void main(String[] args) {
        solution(new String[]{"Kim"});
    }

    public static String solution(String[] seoul) {
        String answer = "";

        for (int i = 0; i < seoul.length; i++) {
            if (seoul[i].equals("Kim")) {
                answer = "김서방은 " + i + "에 있다";
            }
        }

        return answer;
    }
}
