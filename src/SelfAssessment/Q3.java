package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q3 {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int age = Integer.parseInt(br.readLine());
            int threshold = 20;

            if (age >= threshold) {
                System.out.printf("adult");
            } else {
                System.out.println(threshold - age + " years later");
            }

    }
}
