package java_04_control_statements;

import java.util.Scanner;

public class Conditional_Operator_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Enter value of x : ");
        x = sc.nextInt();
        y = (x > 0) ? 1 : (x == 0) ? 0 : -1;
        System.out.println("y = " + y);
        sc.close();
    }
}
