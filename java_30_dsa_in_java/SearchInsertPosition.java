package java_30_dsa_in_java;

import java.util.Scanner;

public class SearchInsertPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length 0f array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.print("Enter element of array : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter your target element : ");
        int target = sc.nextInt();
        int index = -1;
        int right = n - 1;
        int left = 0;
        int mid = 0;
        while (left <= right) {
            mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                index = mid;
                break;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }

        }
        if (index == -1) {
            index = left;
        }
        System.out.println("Search insert position: " + index);
        sc.close();
    }
}
