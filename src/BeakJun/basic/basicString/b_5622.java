package BeakJun.basic.basicString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_5622 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] str = s.split("");
        int[] num = new int[str.length];
        int sum = 0;

        for (int i = 0; i < num.length; i++) {
            num[i] = str[i].charAt(0) - 65;
            if (0 <= num[i] && num[i] < 3)
                sum += 3;
            else if (3 <= num[i] && num[i] < 6)
                sum += 4;
            else if (6 <= num[i] && num[i] < 9)
                sum += 5;
            else if (9 <= num[i] && num[i] < 12)
                sum += 6;
            else if (12 <= num[i] && num[i] < 15)
                sum += 7;
            else if (15 <= num[i] && num[i] < 19)
                sum += 8;
            else if (19 <= num[i] && num[i] < 22)
                sum += 9;
            else if (22 <= num[i] && num[i] <= 25)
                sum += 10;
        }
        System.out.println(sum);

    }
}
