package java_04_control_statements;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your 1st number : ");
        double n1 = sc.nextDouble();
        System.out.print("Enter your 2nd number : ");
        double n2 = sc.nextDouble();
        System.out.print("Enter your oprator : ");
        char op = sc.next().charAt(0);
        double result;
        switch (op) {
            case '+':
                result = n1 + n2;
                System.out.println("Result = " + result);
                break;
            case '-':
                result = n1 - n2;
                System.out.println("Result = " + result);
                break;
            case '*':
                result = n1 * n2;
                System.out.println("Result = " + result);
                break;
            case '/':
                result = n1 / n2;
                System.out.println("Result = " + result);
                break;
            default:
                System.out.println("Invalid Operater");
        }
        sc.close();
    }
}
