package Programmers.level_1;

import java.util.Arrays;

public class 행렬의덧셈 {
    public static void main(String[] args) {
        int[][] arr1 =
                {{1}, {2}};

        int[][] arr2 =
                {{3}, {4}};

        System.out.println(Arrays.deepToString(solution(arr1, arr2)));

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        int row = arr1.length;
        int column = arr1[0].length;

        answer = new int[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}
