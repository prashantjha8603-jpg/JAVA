package java_05_loops;

public class Investment_equation {
    public static void main(String[] args) {
        double P, r, V;
        int n;
        for (P = 1000; P <= 10000; P += 1000) {

            for (r = 0.1; r <= 0.2; r += 0.01) {

                for (n = 1; n <= 10; n++) {

                    V = P * Math.pow((1 + r), n);

                    System.out.println("P = " + P +
                            " r = " + String.format("%.2f", r) +
                            " n = " + n +
                            " V = " + String.format("%.2f", V));
                }

                System.out.println("-----------------------------------");
            }

            System.out.println("======================================");
        }
        
    }
}
