package java_39_recursion;

import java.util.Scanner;

public class FindMaximumInArray {
    public static int maximum(int[] arr, int x, int n) {
        if (n == arr.length - 1) {
            return Math.max(arr[n], x);
        }
        int max = Math.max(arr[n], x);

        return maximum(arr, max, n + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print("Maximum element is not defined for empty array.");
            sc.close();
            return;
        }
        if (n<0) {
            System.out.print("Please enter positve size for array");
            sc.close();
            return;
        }
        System.out.print("Enter elemnt of array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Maximum element of array is : " + maximum(arr, arr[0], 0));
        sc.close();
    }
}