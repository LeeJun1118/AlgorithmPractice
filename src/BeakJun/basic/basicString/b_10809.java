package BeakJun.basic.basicString;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class b_10809 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        int[] location = new int[26];

        //알파벳 소문자
        String[] alphabet = new String[26];
        int j = 97;
        for (int i = 0; i < 26; i++) {
            alphabet[i] = String.valueOf((char) j);
            j++;
        }

        //입력 받은 값 분리
        String[] c = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            c = s.split("");
        }
        Arrays.fill(location, -1);

        for (int i = 0; i < c.length; i++) {
            for (int k = 0; k < alphabet.length; k++) {
                if (c[i].equals(alphabet[k]) && location[k] == -1) {
                    location[k] = i;
                }
            }
        }
        for (int k : location) {
            System.out.print(k + " ");
        }
    }
}
