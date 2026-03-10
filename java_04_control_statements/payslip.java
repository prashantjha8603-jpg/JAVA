package java_04_control_statements;

import java.util.Scanner;

public class payslip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter amout of Basic pay : ");
        double basic_pay = sc.nextDouble();
        double DA = basic_pay / 2;
        double HRA = basic_pay / 5;
        double PF = basic_pay / (14 * 100);
        double Gross = basic_pay + DA + HRA - PF;
        System.out.printf("Now ,\nYour DA is %.4f Rupee.\nYour HRA is %.4f Rupee.\nYour PF is %.4f Rupee.\nTherefore your Gross Pay is %.4f Rupee.",DA,HRA,PF,Gross);
        sc.close();
    }
}
