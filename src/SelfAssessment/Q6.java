package SelfAssessment;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q6 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        char gender = st.nextToken().charAt(0);
        int age = Integer.parseInt(st.nextToken());
        int ageThreshold = 18;

        if (gender == 'M') {
            if (age >= ageThreshold){
                System.out.println("MAN");
            } else {
                System.out.println("BOY");
            }
        }
        else if (gender == 'F') {
            if (age >= ageThreshold){
                System.out.println("WOMAN");
            } else {
                System.out.println("GIRL");
            }
        }
    }
}