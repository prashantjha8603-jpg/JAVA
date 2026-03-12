package java_04_control_statements;

import java.util.Scanner;

public class Marks_Ranging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of student apper in exam : ");
        int student_number = sc.nextInt();
        int[] arr = new int[student_number];
        int A = 0, B = 0, C = 0, D = 0, E = 0;
        for (int i = 0; i < student_number; i++) {
            System.out.print("Enter marks of student number " + (i + 1)+" ");
            arr[i] = sc.nextInt();
            if (arr[i] > 80 && arr[i] <= 100)
                A++;
            else if (arr[i] > 60 && arr[i] <= 80)
                B++;
            else if (arr[i] > 40 && arr[i] <= 60)
                C++;
            else if (arr[i] > 0 && arr[i] <= 40)
                D++;
            else
                E++;
        }
        System.out.println(A + " Student get mark between 81 to 100");
        System.out.println(B + " Student get mark between 61 to 80");
        System.out.println(C + " Student get mark between 41 to 60");
        System.out.println(D + " Student get mark between 0 to 40");
        System.out.println(E + " entered marks is invalid");
        sc.close();
    }
}
