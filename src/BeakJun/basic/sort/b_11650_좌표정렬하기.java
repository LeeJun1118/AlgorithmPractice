package BeakJun.basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_11650_좌표정렬하기 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bf.readLine());
        int[][] arr = new int[N][2];
        StringTokenizer st;
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        //int[][]는 변수의 타입이 int[]인 1차원 배열이라 볼 수 있다.
        Arrays.sort(arr, (a,b) -> {
            //계산 결과가 음수인지 양수인지에 따라 우선 순위를 비교한다.

            //첫번째 값을 비교했을 때 두 값이 같으면 두번째 값끼리 비교한다.
            if (a[0] == b[0]) {
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            sb.append(arr[i][0]);
            sb.append(" ");
            sb.append(arr[i][1]);
            sb.append('\n');
        }
        System.out.println(sb);
    }
}
