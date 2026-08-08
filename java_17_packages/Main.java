package java_17_packages;

import java.util.Scanner;
import java_17_package_Exam.Assignment;
import java_17_package_Exam.Exam;
import java_17_package_Assignment.StudentDetails;
import java_17_package_Assignment.Library;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Exam exam = new Exam();
        Assignment assignment = new Assignment();
        StudentDetails student = new StudentDetails();
        Library library = new Library();
        int choice;
        do {
            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Display Student Result");
            System.out.println("2. Display Assignment Details");
            System.out.println("3. Display Library Book Details");
            System.out.println("4. Display Books Taken Before Exam");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    student.displayStudentDetails();
                    exam.displayResult();
                    break;
                case 2:
                    assignment.displayAssignment();
                    break;
                case 3:
                    library.displayLibrary();
                    break;
                case 4:
                    student.displayStudentDetails();
                    break;
                case 5:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
        sc.close();
    }
}
