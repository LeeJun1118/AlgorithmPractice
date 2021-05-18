package BeakJun.basic.basicFunction;

import java.util.Arrays;

public class b_4673 {
    public static void main(String[] args) {

       /*
        1 + 0 + 1 = 2
        2 + 0 + 2 = 4
        3 + 0 + 3 = 6
        4 + 0 + 4 = 8
        5 + 0 + 5 = 10
        6 + 0 + 6 = 12
        7 + 0 + 7 = 14
        8 + 0 + 8 = 16
        9 + 0 + 9 = 18
        10 + 1 + 0 = 11;
        11 + 1 + 1 = 13;
        12 + 1 + 2 = 15
        13 + 1 + 3 = 17
        14 + 1 + 4 = 19
        15 + 1 + 5 = 21
        16 + 1 + 6 = 23
        17 + 1 + 7 = 25
        18 + 1 + 8 = 27
        19 + 1 + 9 = 29
        20 + 2 + 0 = 22
        21 + 2 + 1 = 24

        1234 + 4 + 3 + 2 + 1
        */



        int[] n = new int[30];
        int con = 0; //생성자

        for (int i = 0; i < n.length; i++) {
            int k = 1; //  x10 x100 ...
            int sum = 0;

            if (con < 10)
                n[con * 2]++;
            else {
                //10
                while (con > 0){
                    //1
                    con = con/k;
                    System.out.println("con : " + con);
                    //11
                    sum = sum + con%10;
                    k *= 10;
                }
                n[sum]++;
            }
            con++;
        }

        for (int i = 0; i < n.length; i++) {
            if (n[i] == 0)
                System.out.println(i);
        }

    }
}
