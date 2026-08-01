package java_09_classes_and_objects;

class Secondclass {
    static String message;

    // Static block

    static {
        message = "message is initialized using Static Block";
        System.out.println("Static block of second class is executed");
    }

}

public class static_block {

    static String name = "Exercise 9.1 initialized using Static feild";

    static void display() {
        System.out.println("First field : " + name);
        System.out.println("Second field : " + Secondclass.message);
    }

    public static void main(String[] args) {
        display();
    }
}
