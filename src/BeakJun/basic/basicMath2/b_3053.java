package BeakJun.basic.basicMath2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class b_3053 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double r = Integer.parseInt(br.readLine());

        double pi = Math.pow(r, 2) * Math.PI;
        double hr = Math.pow(r, 2) * 2;

        System.out.println(String.format("%.6f", pi));
        System.out.println(String.format("%.6f", hr));
    }
}
