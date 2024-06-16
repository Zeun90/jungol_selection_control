package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Q4 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        double input = Double.parseDouble(br.readLine());

        if (50.80 >= input) {
            System.out.println("Flyweight");
        }
        else if (61.23 >= input && input > 50.80) {
            System.out.println("Lightweight");
        }
        else if (72.57 >= input && input > 61.23) {
            System.out.println("Middleweight");
        }
        else if (88.45 >= input && input > 72.57) {
            System.out.println("Cruiserweight");
        }
        else if (input > 88.45) {
            System.out.println("Heavyweight");
        }
    }
}