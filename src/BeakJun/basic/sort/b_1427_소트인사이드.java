package BeakJun.basic.sort;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class b_1427_소트인사이드 {
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] N = bf.readLine().split("");

        int[] arr = Arrays.stream(N)
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::parseInt)
                .toArray();

        StringBuilder s = new StringBuilder();
        for (int n : arr) {
            s.append(n);
        }
        System.out.println(s);

    }
}
