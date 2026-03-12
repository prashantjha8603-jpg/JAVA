package java_04_control_statements;

import java.util.Scanner;

public class Else_if_fuction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.print("Enter value of x : ");
        x = sc.nextInt();
        if (x > 0)
            y = 1;
        else if (x == 0)
            y = 0;
        else
            y = -1;
        System.out.println("y = " + y);
        sc.close();
    }
}
