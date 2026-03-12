package java_04_control_statements;

import java.util.Scanner;

public class Solutin_of_linear_equation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("For First Equation :- ");
        System.out.print("Enter Coefficient Of X1 :-");
        int a = sc.nextInt();
        System.out.print("Enter Coefficient Of X2 :-");
        int b = sc.nextInt();
        System.out.print("Enter Constant Part Of First Equation :-");
        int m = sc.nextInt();
        System.out.println("For Second Equation :- ");
        System.out.print("Enter Coefficient Of X1 :-");
        int c = sc.nextInt();
        System.out.print("Enter Coefficient Of X2 :-");
        int d = sc.nextInt();
        System.out.print("Enter Constant Part Of Second Equation :-");
        int n = sc.nextInt();
        if ((a * d - c * d) != 0) {
            System.out.printf("Value of X1 is : %.2f\n", ((m * d - b * n) * 1.0 / (a * d - c * d)));
            System.out.printf("Value of X2 is : %.2f", ((n * a - m * c) * 1.0 / (a * d - c * d)));
        } else {
            System.out.print("Solution Do Not Exist For These Equations");
        }
        sc.close();
    }
}
