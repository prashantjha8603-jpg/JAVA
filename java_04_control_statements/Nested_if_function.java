package java_04_control_statements;

import java.util.Scanner;

public class Nested_if_function {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Enter value of x : ");
        x = sc.nextInt();
        if (x >= 0) {
            if (x == 0) {
                y = 0;
            } else {
                y = 1;
            }
        } else {
            y = -1;
        }
        System.out.println("y = " + y);
        sc.close();
    }
}