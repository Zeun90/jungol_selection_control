package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int input1 = Integer.parseInt(st.nextToken());
        int input2 = Integer.parseInt(st.nextToken());

        if (input1 > input2) {
            System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.", input1, input2);
        }
        else if (input1 < input2){
            System.out.printf("입력받은 수 중 큰 수는 %d이고 작은 수는 %d입니다.", input2, input1);
        }
    }
}
