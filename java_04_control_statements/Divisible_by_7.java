package java_04_control_statements;

public class Divisible_by_7 {
    public static void main(String[] args) {
        int count = 0, sum = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 7 == 0) {
                count++;
                sum += i;
            }
        }
        System.out.println("\n\n\nTotal number of digit between 100 and 200 which is divisivle by 7 is " + count
                + "and the sum of all digits is " + sum + "\n\n\n");
    }
}
