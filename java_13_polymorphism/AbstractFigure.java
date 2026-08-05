package java_13_polymorphism;

abstract class TwoDFigure {
    String color;
    double weight;

    TwoDFigure() {
        color = "White";
        weight = 1.0;
    }

    String getcolor() {
        return color;
    }

    double getweight() {
        return weight;
    }

    abstract double findArea();

    abstract double findCircumference();

}

class Triangle extends TwoDFigure {
    double a, b, c;
    double height;

    Triangle(double a, double b, double c, double height) {
        super();
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

    @Override
    double findArea() {
        return b * height / 2;
    }

    @Override
    double findCircumference() {
        return a + b + c;
    }

}

class Rectangle extends TwoDFigure {
    double length, breath;

    Rectangle(Double l, double b) {
        super();
        this.length = l;
        this.breath = b;
    }

    @Override
    double findArea() {
        return length * breath;
    }

    @Override
    double findCircumference() {
        return 2 * (length + breath);
    }

}

public class AbstractFigure {
    public static void main(String[] args) {
        TwoDFigure figure;
        figure = new Triangle(3, 4, 5,4);
        System.out.println("Triangle");
        System.out.println("Color : " + figure.getcolor());
        System.out.println("Weight : " + figure.getweight());
        System.out.println("Area : " + figure.findArea());
        System.out.println("Circumference : " + figure.findCircumference());

        System.out.println();
        
        figure = new Rectangle(10.0,5); 
        System.out.println("Rectangle");
        System.out.println("Color : " + figure.getcolor());
        System.out.println("Weight : " + figure.getweight());
        System.out.println("Area : " + figure.findArea());
        System.out.println("Circumference : " + figure.findCircumference());

    }
}
