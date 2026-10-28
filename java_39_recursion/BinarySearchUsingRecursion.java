package java_39_recursion;

import java.util.Scanner;

public class BinarySearchUsingRecursion {
    public static int targetIndexForSortedArray(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = left + (right - left) / 2;
        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            left =mid+1;
        }else{
            right=mid-1;
        }
        return targetIndexForSortedArray(arr, target, left, right);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        if (n == 0) {
            System.out.print("No element is present in array");
            sc.close();
            return;
        }
        if (n < 0) {
            System.out.print("Please enter positve number");
            sc.close();
            return;
        }
        System.out.print("Enter element of array in sorted ordered : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter your target element : ");
        int target = sc.nextInt();
        int index = targetIndexForSortedArray(arr, target, 0, n-1);
        if (index == -1) {
            System.out.println("Not Found");
        } else {
            System.out.println("Found At index : " + index);
        }
        sc.close();
    }
}
