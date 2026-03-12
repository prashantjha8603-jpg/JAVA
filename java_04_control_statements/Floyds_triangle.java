package java_04_control_statements;

public class Floyds_triangle {
    public static void main(String[] args) {
        int number=1;
        for(int i=0;i<=12;i++){
            for(int j=1;j<=i;j++){
                System.out.print(number+" ");
                number++;
            }
            System.out.println();
        }
    }   
}
