package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("점수를 입력하세요. ");
        int input = Integer.parseInt(br.readLine());
        int threshold = 80;

        if (input >= threshold) {
            System.out.println("축하합니다. 합격입니다.");
        }
        else {
            System.out.println("불합격입니다.");
        }
    }
}
