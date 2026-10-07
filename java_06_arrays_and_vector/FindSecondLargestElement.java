package java_06_arrays_and_vector;

import java.util.Scanner;

public class FindSecondLargestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        System.out.print("Enter element of array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        int y = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > second && arr[i] != largest) {
                y = 1;
                second = arr[i];
            }
        }

        if (y == 0) {
            System.out.println("There is no second largest number in array.");
        } else {
            System.out.print("second largest number of the given array is : " + second);
        }
        sc.close();
    }
}