package java_12_constructors;
public class Complex_Number {
    int real;
    int img;
    Complex_Number() {
        real = 0;
        img = 0;
    }
    Complex_Number(int r, int i) {
        real = r;
        img = i;
    }
    Complex_Number(Complex_Number c) {
        real = c.real;
        img = c.img;
    }
    Complex_Number sum(Complex_Number c) {
        Complex_Number temp = new Complex_Number();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;
    }
    void display() {
        System.out.println(real + " + " + img + "i");
    }
    public static void main(String[] args) {
        Complex_Number c1 = new Complex_Number(3, 4);
        Complex_Number c2 = new Complex_Number(5, 6);
        Complex_Number result = c1.sum(c2);
        System.out.print("sum: ");
        result.display();
    }
}