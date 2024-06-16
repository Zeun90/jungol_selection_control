package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("점수를 입력하세요. ");
        int input = Integer.parseInt(br.readLine());

        if (100 >= input && input >= 90) {
            System.out.println("A");
        }
        else if (90 > input && input >= 80) {
            System.out.println("B");
        }
        else if (80 > input && input >= 70) {
            System.out.println("C");
        }
        else if (70 > input && input >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}