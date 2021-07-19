package BeakJun.basic.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_1085 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int w = Integer.parseInt(st.nextToken());
        int h = Integer.parseInt(st.nextToken());

        int minX = -1;
        int minY = -1;

        if (w - x > x)
            minX = x;
        else
            minX = w - x;

        if (h - y > y)
            minY = y;
        else
            minY = h - y;

        if (minX > minY)
            System.out.println(minY);
        else System.out.println(minX);
    }
}
