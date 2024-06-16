package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        System.out.print("세 수를 입력하세요. ");
        st = new StringTokenizer(br.readLine());
        int input1 = Integer.parseInt(st.nextToken());
        int input2 = Integer.parseInt(st.nextToken());
        int input3 = Integer.parseInt(st.nextToken());
        int biggest;

        if (input1 >= input2 && input1 >= input3) {
            biggest = input1;
        }
        else if (input2 >= input1 && input2 >= input3) {
            biggest = input2;
        }
        else {
            biggest = input3;
        }

        System.out.printf("입력받은 수 중 가장 큰 수는 %d입니다.", biggest);
    }
}