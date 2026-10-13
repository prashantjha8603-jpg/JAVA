package java_30_dsa_in_java;

import java.util.Scanner;

public class RightRotateArray {
    public static void reverse(int[] arr, int left, int right) {
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size Of Your Array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter your Array Element : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter number Of element you want to rotate from right : ");
        int k = sc.nextInt();

        if (n > 0) {
            k = k % n;
            reverse(arr, 0, n - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
        }
        System.out.println("Rotated Array : " + java.util.Arrays.toString(arr));
        sc.close();
    }
}
