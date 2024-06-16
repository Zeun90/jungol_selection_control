package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q5 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double input1 = Double.parseDouble(st.nextToken());
        double input2 = Double.parseDouble(st.nextToken());
        double threshold1 = 4.0;
        double threshold2 = 3.0;

        if (input1 >= threshold1 && input2 >= threshold1) {
            System.out.println("A");
        }
        else if (input1 >= threshold2 && input2 >= threshold2) {
            System.out.println("B");
        }
        else {
            System.out.println("C");
        }
    }
}