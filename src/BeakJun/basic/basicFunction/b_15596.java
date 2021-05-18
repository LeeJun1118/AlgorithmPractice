package BeakJun.basic.basicFunction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class b_15596 {
    static long sum(int[] a) {
        long ans = 0;
        for (int i : a) {
            ans += i;
        }
        return ans;
    }
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        int[] a = new int[stringTokenizer.countTokens()];

        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        System.out.println(sum(a));
    }
}
