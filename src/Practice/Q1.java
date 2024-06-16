package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        int threshold = 10;

        if (input > threshold) {
            System.out.println(input);
            System.out.println(threshold + "보다 큰 수를 입력하셨습니다.");
        }
    }
}
