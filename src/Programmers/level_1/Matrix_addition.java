package Programmers.level_1;

import java.util.Arrays;

public class Matrix_addition {
    public static void main(String[] args) {
        int[][] arr1 =
                {{1}, {2}};

        int[][] arr2 =
                {{3}, {4}};

        System.out.println(Arrays.deepToString(solution(arr1, arr2)));

    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = {};

        int loop = arr1.length;
        answer = new int[loop][loop];

        for (int i = 0; i < loop; i++) {
            for (int j = 0; j < loop; j++) {
                System.out.println("loop");
                System.out.println("i = " + i);
                System.out.println("j = " + j);
                System.out.println();

                //answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }


        return answer;
    }
}
