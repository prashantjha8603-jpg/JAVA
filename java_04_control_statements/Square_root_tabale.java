package java_04_control_statements;

public class Square_root_tabale {
    public static void main(String[] args) {
        System.out.println("Square Root Table\n");
        System.out.print("Number\t");
        double number;

        for (double j = 0.0; j <= 0.9; j += 0.1) {
            System.out.printf("%.1f\t", j);
        }
        System.out.println();

        for (int i = 0; i <= 9; i++) {
            System.out.print(i + ".0\t");

            for (double j = 0.0; j <= 0.9; j += 0.1) {
                number = i + j;

                if (number >= 0) {
                    double result = Math.sqrt(number);
                    System.out.printf("%.2f\t", result);
                }

            }
            System.out.println();

        }
    }
}
