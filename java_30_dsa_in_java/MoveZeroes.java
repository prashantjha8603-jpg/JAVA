package java_30_dsa_in_java;

import java.util.Scanner;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter your array elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[p] = arr[i];
                p++;
            }
        }
        while (p < n) {
            arr[p] = 0;
            p++;
        }
        System.out.println(Arrays.toString(arr));

        sc.close();
    }
}
