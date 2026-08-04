package java_06_arrays_and_vector;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter target : ");
        int target = sc.nextInt();
        int x=0;
        int arr[]={1,2,65,34,86,474,9,5,24,65,98,0,4};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                x=1;
                System.out.println("FOUND");
                break;
            }
        }
        if(x==0){
            System.out.println("NOT FOUND");
        }
        sc.close();
    }

}
