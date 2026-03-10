package java_03_operators;

import java.util.Scanner;

public class EOQ_and_TBO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The Demand rate : ");
        int Demand = sc.nextInt();
        System.out.print("Enter The Setup cost : ");
        int Setup = sc.nextInt();
        System.out.print("Enter The Holding cost per unit time : ");
        int Holding = sc.nextInt();
        double EOQ = Math.sqrt((2.0 * Setup * Demand) / Holding);
        double TBO = Math.sqrt((2.0 * Setup) / (Demand * Holding));
        System.out.printf("The EOQ is %.4f and the TBO is %.4f", EOQ, TBO);
        sc.close();
    }
}