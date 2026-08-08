package java_06_arrays_and_vector;

import java.util.Scanner;

public class SecondHighest_Element {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of element : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter element of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int a = Integer.MIN_VALUE;
        int b = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {

            if (a < arr[i]) {
                a = arr[i];
            }
        }
        for (int i = 0; i < n; i++) {
            if (b < arr[i] && a != arr[i]) {
                b = arr[i];
            }
        }
        System.out.println("Second largest element is : " + b);
        sc.close();
    }

}
