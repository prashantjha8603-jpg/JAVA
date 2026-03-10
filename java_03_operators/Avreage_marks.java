package java_03_operators;

import java.util.Scanner;

public class Avreage_marks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total number of Student : ");
        int Student_number = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= Student_number; i++) {
            System.out.print("Enter the marks of " + i + " student : ");
            int marks = sc.nextInt();
            sum = sum + marks;
        }
        System.out.println("Total marks of all student : " + sum);
        System.out.println("Avreage mark of students is " + sum/Student_number);
        sc.close();

    }
}
