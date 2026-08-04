package java_07_strings;

import java.util.Scanner;

public class QuizProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String correctAnswer = "Bjarne Stroustrup";

        System.out.println("Who is the inventor of c++ ?");
        for (int i = 1; i <= 3; i++) {

            System.out.print("Enter your answer : ");
            String answer = sc.nextLine();

            if (answer.equalsIgnoreCase(correctAnswer)) {

                System.out.println("Good");
                sc.close();
                return;

            } else {

                System.out.println("Try Again");

            }
        }

        System.out.println("Correct Answer : " + correctAnswer);

        sc.close();
    }
}
