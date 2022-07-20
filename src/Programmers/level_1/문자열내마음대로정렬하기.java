package Programmers.level_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {

        String[] a = {"abd","abc", "kbd",  "abe"};
        String[] result = solution(a, 2);

        System.out.println(Arrays.toString(result));

    }
    //문자열의 n번째 글자를 기준으로 오름차순 정렬
    //n번째가 같으면 사전 순으로 정렬
    public static String[] solution(String[] strings, int n) {

        ArrayList<String> list = new ArrayList<>();

        //문자열의 n번째 글자를 해당 문자열의 맨 앞에 붙임
        for (int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }

        //오름차순으로 정렬
        Collections.sort(list);

        String[] answer = new String[list.size()];
        //붙였던 n번째 글자를 뺀 나머지 문자열만 결과 배열에 하나씩 넣음
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i).substring(1);
        }

        return answer;
    }
}
