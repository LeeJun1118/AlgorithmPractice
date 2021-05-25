package BeakJun.basic.basicString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        bufferedReader.close();

        String[] st = s.split(" ");

        int count = 0;

        for (String value : st) {
            if (!value.equals(""))
                count++;
        }
        System.out.println(count);
    }
}
