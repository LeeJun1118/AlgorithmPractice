package BeakJun.basic.basicString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferedReader.readLine();
        String[] input = s.split("");
        int[] num = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            char c = s.charAt(i);
            num[i] = c;
        }

        int[] alphabet = new int[26];

        for (int value : num) {
            if (value < 97)
                alphabet[value - 65]++;
            else
                alphabet[value - 97]++;
        }

        int index = 0;
        int max = 0;
        int count = 0;
        for (int j = 0; j < alphabet.length; j++) {
            if (max < alphabet[j]) {
                count = 0;
                max = alphabet[j];
                index = j;
            } else if (max == alphabet[j])
                count++;
        }
        if (count > 0) {
            System.out.println("?");
        } else {
            char ch = (char) (index + 65);
            System.out.println(ch);
        }
    }
}
