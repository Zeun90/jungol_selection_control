package Formative;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        if (input > 0) {
            System.out.println("plus");
        } else if (input == 0) {
            System.out.println("zero");
        } else {
            System.out.println("minus");
        }
    }
}
