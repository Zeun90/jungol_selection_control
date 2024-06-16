package Practice;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q7 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("1. 삽입\n2. 수정\n3. 삭제\n숫자를 선택하세요. ");
        int input = Integer.parseInt(br.readLine());

        switch (input) {
            case 1:
                System.out.println("삽입을 선택하셨습니다.");
                break;
            case 2:
                System.out.println("수정을 선택하셨습니다.");
                break;
            case 3:
                System.out.println("삭제를 선택하셨습니다.");
                break;
        }
    }
}