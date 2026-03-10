package java_02_variable_and_data_types;
import java.util.*;
public class sum_of_harmonic_series{
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter the term of harmonic series : ");
        int term_number = sc.nextInt();
        double sum=0;

        for(int i=1;i<=term_number;i++){
            sum += 1.0/i;
        }
        System.out.printf("The sum of harmonic series is : "+"%.4f",sum);
        sc.close();
    }
}