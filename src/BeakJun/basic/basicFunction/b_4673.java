package BeakJun.basic.basicFunction;

import java.util.ArrayList;

public class b_4673 {

    static ArrayList<Integer> selfNumber(){
        ArrayList<Integer> n = new ArrayList<>();

        int con = 1;

        for (int i = 0; i < 10000; i++) {
            int loofCon = con;
            int sum = 0;

            while (loofCon > 0) {
                sum = sum + loofCon % 10;
                loofCon /= 10;
            }
            sum = sum + con;
            if (sum <= 10000)
                n.add(sum);
            con++;
        }
        for (int i = 1; i <= 10000; i++) {
            if (!n.contains(i))
                System.out.println(i);
        }
        return n;
    }

    public static void main(String[] args) {
        selfNumber();
    }
}
