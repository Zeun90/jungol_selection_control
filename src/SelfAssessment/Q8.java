package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q8 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double input = Double.parseDouble(br.readLine());

        if (4.5 >= input && input >= 0) {
            switch ((int) input / 1) {
                case 4:
                    System.out.println("scholarship");
                    break;
                case 3:
                    System.out.println("next semester");
                    break;
                case 2:
                    System.out.println("seasonal semester");
                    break;
                case 1:
                case 0:
                    System.out.println("retake");
                    break;
            }
        }
    }
}