package java_04_control_statements;

public class Floyds_triangle_0_1 {
    public static void main(String[] args) {
        int x = 1;
        int i, j;
        for (i = 1; i <= 10; i++) {
            for (j = 1; j <= i; j++) {
                if ((i + j) % 2 == 0)
                    x = 1;
                else
                    x = 0;
                System.out.print(x + " ");
            }
            System.out.println();
        }
    }
}
