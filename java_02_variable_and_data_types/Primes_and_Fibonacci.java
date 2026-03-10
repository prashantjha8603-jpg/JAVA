package java_02_variable_and_data_types;

import java.util.Scanner;
public class Primes_and_Fibonacci {
    static boolean Prime(int n){
        if(n<2) return false;
        for(int i=2;i<=Math.sqrt(n);i++){
            if(n%i==0) return false; 
        }
        return true ;
    }
    static boolean Fibonacci(int n){
        if(n==0) return true;
        int a=0,b=1;
        while(n>=b){
            if(n==b) return true;
            int c=a+b;
            a=b;
            b=c;
        }
        return false;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range number : ");
        int lower = sc.nextInt();
        System.out.print("Enter higher range number : ");
        int higher = sc.nextInt();
        System.out.print("The Primefibo number is : ");
        for(int i=lower;i<=higher;i++){
            if(Prime(i)&&Fibonacci(i)){
                System.out.print(i+" ");
            }
        }
        sc.close();
    }
}