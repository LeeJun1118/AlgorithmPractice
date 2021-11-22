package BeakJun.basic.recursive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_2447_star {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bufferedReader.readLine());

        System.out.println(star(n));
    }

    public static String star(int n) {

        if (n / 3 < 1)
            return "*";
        else {
            return star(n/3);
        }
    }
}


/**
 *              *********************************************************************************
 *              * ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** *
 *              *********************************************************************************
 *              *********         ******************         ******************         *********
 *              * ** ** *         * ** ** ** ** ** *         * ** ** ** ** ** *         * ** ** *
 *              *********         ******************         ******************         *********
 *              *********************************************************************************
 *              * ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** *
 *              *********************************************************************************
 *              ***************************                           ***************************
 *              * ** ** ** ** ** ** ** ** *                           * ** ** ** ** ** ** ** ** *
 *              ***************************                           ***************************
 *              *********         *********                           *********         *********
 *              * ** ** *         * ** ** *                           * ** ** *         * ** ** *
 *              *********         *********                           *********         *********
 *              ***************************                           ***************************
 *              * ** ** ** ** ** ** ** ** *                           * ** ** ** ** ** ** ** ** *
 *              ***************************                           ***************************
 *              *********************************************************************************
 *              * ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** *
 *              *********************************************************************************
 *              *********         ******************         ******************         *********
 *              * ** ** *         * ** ** ** ** ** *         * ** ** ** ** ** *         * ** ** *
 *              *********         ******************         ******************         *********
 *              *********************************************************************************
 *              * ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** ** *
 *              *********************************************************************************
 *  */