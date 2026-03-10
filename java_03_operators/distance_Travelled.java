package java_03_operators;
import java.util.Scanner;
public class distance_Travelled {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the initial speed in meter per second : ");
        int speed = sc.nextInt();
        System.out.print("Enter the starting time of travelled in second : ");
        int time1 = sc.nextInt();
        System.out.print("Enter the ending time of travelled in second : ");
        int time2 = sc.nextInt();
        int time = time2 - time1;
        System.out.print("Enter the acceleration of body in metre per second square : ");
        int acc = sc.nextInt();
        double Distance = speed * time + (acc * time * time) / 2.0;
        System.out.println("The distance cover by the body during travelled in meater is : " + Math.abs(Distance));
        sc.close();
    }
}