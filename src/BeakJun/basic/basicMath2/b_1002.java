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

            // 각각의 좌표
            double jx = Math.abs(Double.parseDouble(arr[0]));
            double jy = Math.abs(Double.parseDouble(arr[1]));
            double jr = Math.abs(Double.parseDouble(arr[2]));
            double bx = Math.abs(Double.parseDouble(arr[3]));
            double by = Math.abs(Double.parseDouble(arr[4]));
            double br = Math.abs(Double.parseDouble(arr[5]));

            // J,B 사이의 거리 구하기
            double jb_x = Math.abs(jx - bx);
            double jb_y = Math.abs(jy - by);
            double jb_distance = Math.sqrt(Math.pow(jb_x, 2) + Math.pow(jb_y, 2));

            // r 과의 거리 합
            double r_sum = Integer.parseInt(arr[2]) + Integer.parseInt(arr[5]);

            //내접, 외접, 포함, 교접, else

            // 둘의 좌표가 같을 때
            if (jx == bx && jy == by) {
                if (jr == br)
                    System.out.println(-1);
                else
                    System.out.println(0);
            }
            // J 원 안에 B 원이 있고 R이 b가 더 작을 때
            else if ((Math.abs(jx + jr) > Math.abs(bx + br) && Math.abs(jx - jr) > Math.abs(bx - br)) &&
                    Math.abs(jy + jr) > Math.abs(by + br) && Math.abs(jy - jr) > Math.abs(by - br)) {
            }
            // B 안에 J가 있을 때
            else if (jx + jr < bx + br && jy + jr < by + br) {

            }


            //좌표가 다를 때
            else {
                if (jb_distance == r_sum)
                    System.out.println(1);
                else if (jb_distance < r_sum)
                    System.out.println(2);
                else if (jb_distance > r_sum)
                    System.out.println(0);
                else
                    System.out.println(-1);
            }
        }
    }
}
