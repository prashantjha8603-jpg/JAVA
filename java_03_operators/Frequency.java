package java_03_operators;
import java.util.Scanner;
public class Frequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Inductance : ");
        float L= sc.nextFloat();
        System.out.print("Enter Resistance : ");
        float R= sc.nextFloat();
        System.out.print("Enter Capacitance : ");
        float C= sc.nextFloat();
        double Frequency=Math.sqrt(1/(L*C)-(R*R)/4*C*C);
        System.out.println("The Frequency is "+ Frequency);
        sc.close();
    }
}
