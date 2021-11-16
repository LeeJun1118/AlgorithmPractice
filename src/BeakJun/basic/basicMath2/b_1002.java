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
            double jxAbs = Math.abs(Double.parseDouble(arr[0]));
            double jyAbs = Math.abs(Double.parseDouble(arr[1]));
            double bxAbs = Math.abs(Double.parseDouble(arr[3]));
            double byAbs = Math.abs(Double.parseDouble(arr[4]));

            double jx = Double.parseDouble(arr[0]);
            double jy = Double.parseDouble(arr[1]);
            double jr = Double.parseDouble(arr[2]);
            double bx = Double.parseDouble(arr[3]);
            double by = Double.parseDouble(arr[4]);
            double br = Double.parseDouble(arr[5]);

            // J,B 사이의 거리 구하기
            double jb_x = Math.abs(jxAbs - bxAbs);
            double jb_y = Math.abs(jyAbs - byAbs);

            // r 과의 거리 합
            double r_sum = Integer.parseInt(arr[2]) + Integer.parseInt(arr[5]);

            // 둘의 좌표가 같을 때
            if (jx == bx && jy == by) {
                if (jr == br)
                    System.out.println(-1);
                else
                    System.out.println(0);
            }
            //좌표가 다를 때
            else {
                // 한 원이 다른 원 안에 있는데 R 이 서로 다를 때
                if (jxAbs + jr > bxAbs + br && jyAbs + jr > byAbs + br)
                    System.out.println(0);
                // 내접할 때
                else if ((jxAbs + jr == bxAbs + br || jyAbs + jr > byAbs + br) || (jxAbs + jr > bxAbs + br || jyAbs + jr == byAbs + br))
                    System.out.println(1);
                // 겹치는 곳이 두 곳 생길 때
                else if ((jx + jr > bx - br || jy + jr > by - br) || (bx + br > jx - jr || by + br > jy - jr))
                    System.out.println(2);
                // 외접할때 코드 작성 필요함
                else
                    System.out.println(0);
            }
        }
    }
}
