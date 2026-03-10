package java_03_operators;

import java.util.Scanner;

public class Salvage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the purchase price : ");
        int purchase = sc.nextInt();
        System.out.print("Enter the depreciation price : ");
        int depreciation = sc.nextInt();
        System.out.print("Enter the service year : ");
        int service = sc.nextInt();
        double Salvage = purchase - depreciation * service;
        System.out.println("Salvage price is " + Salvage);
        sc.close();
    }
}
