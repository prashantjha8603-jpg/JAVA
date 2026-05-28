package java_12_constructors;
public class message {
    message() {
        System.out.println("This is default constructor");
    }

    message(String msg) {
        System.out.println("message : " + msg);
    }

    public static void main(String[] args) {
        message m1 = new message();
        message m2 = new message("Good morning");
        System.out.println(m1);
        System.out.println(m2);
    }
}
