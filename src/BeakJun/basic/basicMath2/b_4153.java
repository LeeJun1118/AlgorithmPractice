package BeakJun.basic.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str;
        int a,b,c;
        while (true){
            str = br.readLine().split(" ");
            if (str[0].equals("0") && str[1].equals("0") && str[2].equals("0"))
                break;
            else {
                a = Integer.parseInt(str[0]) * Integer.parseInt(str[0]);
                b = Integer.parseInt(str[1]) * Integer.parseInt(str[1]);
                c = Integer.parseInt(str[2]) * Integer.parseInt(str[2]);

                if (a + b == c || a + c == b || b + c == a)
                    System.out.println("right");
                else
                    System.out.println("wrong");
            }
        }
    }
}
