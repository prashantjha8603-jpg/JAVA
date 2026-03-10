package java_02_variable_and_data_types;

import java.util.Scanner;

public class Temperature_conversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit : ");
        double tem = sc.nextDouble();
        tem = (tem - 32) / 1.8;
        System.out.printf("Temperature is %.2f celsius" , tem);
        sc.close();
    }
}
