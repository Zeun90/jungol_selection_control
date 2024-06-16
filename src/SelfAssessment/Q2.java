package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int height = Integer.parseInt(st.nextToken());
        int weight = Integer.parseInt(st.nextToken());
        int bmi = weight + 100 - height;
        int threshold = 0;

        System.out.println(bmi);
        if (bmi > threshold) {
            System.out.printf("Obesity");
        }
    }
}
