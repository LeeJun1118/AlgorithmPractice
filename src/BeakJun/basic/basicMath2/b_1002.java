package BeakJun.basic.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1002 {
    public static void main(String[] args) throws IOException {

        //원이 두개 나옴
        //두 원이 한 점에 맞닿으면 1, 둘 사이의 거리가
        //J 와 R 사이의 거리 + B 와 R 사이의 거리
        //J 와 B 사이의 거리보다 짧으면 0
        //같으면 1
        //길면 2

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int loop = Integer.parseInt(bufferedReader.readLine());

        String[] arr;
        for (int i = 0; i < loop; i++) {
            arr = bufferedReader.readLine().split(" ");

            int jx = Integer.parseInt(arr[0]);
            int jy = Integer.parseInt(arr[1]);
            int jr = Integer.parseInt(arr[2]);

            int bx = Integer.parseInt(arr[3]);
            int by = Integer.parseInt(arr[4]);
            int br = Integer.parseInt(arr[5]);

            // r 과의 거리 합
            int dis = (int)(Math.pow(jx - bx,2) + Math.pow(jy - by,2));

            // 둘의 좌표가 같을 때
            if (jx == bx && jy == by && jr == br)
                System.out.println(-1);
            else if (dis > Math.pow(jr + br,2))
                System.out.println(0);
            else if (dis < Math.pow(jr - br,2))
                System.out.println(0);
            else if (dis == Math.pow(jr - br,2))
                System.out.println(1);
            else if (dis == Math.pow(jr + br,2))
                System.out.println(1);
            else
                System.out.println(2);

        }
    }
}
