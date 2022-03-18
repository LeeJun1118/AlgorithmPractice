package Programmers.level_1;

import java.util.Arrays;

public class 제일작은수제거하기 {
    public static void main(String[] args) {

        int[] arr = {3,5,2,1,6,8,4,17,20};
        System.out.println(Arrays.toString(solution(arr)));

    }
    public static int[] solution(int[] arr) {
        int[] answer = {};

        if (arr.length <= 1) {
            return new int[]{-1};
        }

        int min = 0;

        //반복문 사용해서 min 구하기
        for (int i = 0; i < arr.length; i++) {
            if (arr[min] > arr[i]) {
                min = i;
            }
        }
        min = arr[min];

        //stream 사용해서 min 구하기
        //min = Arrays.stream(arr).min().getAsInt();

        //min 빼고 배열에 넣기
        answer = new int[arr.length - 1];
        for (int j = 0, i = 0; i < arr.length; i++) {
            if (arr[i] == min){
                continue;
            }
            answer[j++] = arr[i];
        }

        return  answer;
    }
}
