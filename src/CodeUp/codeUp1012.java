package CodeUp;

import java.util.Scanner;

public class codeUp1012 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float num = scan.nextFloat();

        //String.format() 메소드는 C 언어의 printf 함수와 같이 문자열을 사용한 형식 문자열을 만들 수 있다.
        String format6 = String.format("%.6f",num);
        System.out.println(format6);
    }
}
