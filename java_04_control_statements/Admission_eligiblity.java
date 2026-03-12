package java_04_control_statements;

import java.util.Scanner;

public class Admission_eligiblity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks in maths : ");
        int math = sc.nextInt();
        System.out.print("Enter your marks in physics : ");
        int physics = sc.nextInt();
        System.out.print("Enter your marks in chemistry : ");
        int chemistry = sc.nextInt();
        if ((math + physics >= 150)
                || (math >= 60 && physics >= 50 && chemistry >= 40 && (math + physics + chemistry >= 200))) {
            System.out.println("you are eligible for admission ");
        } else {
            System.out.println("you are not eligible for admission ");
        }
        sc.close();
    }
}