package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        System.out.print("주사위를 두 번 던진 결과를 입력하세요. ");
        st = new StringTokenizer(br.readLine());
        int input1 = Integer.parseInt(st.nextToken());
        int input2 = Integer.parseInt(st.nextToken());
        int threshold = 4;

        if (input1 >= threshold && input2 >= threshold) {
            System.out.println("이겼습니다.");
        }
        else if (input1 >= threshold || input2 >= threshold) {
            System.out.println("비겼습니다.");
        }
        else if (input1 < threshold && input2 < threshold) {
            System.out.println("졌습니다.");
        }
    }
}