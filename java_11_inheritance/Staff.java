package java_11_inheritance;

public class Staff {
    int code;
    String name;

    void setStaff(int c, String n) {
        code = c;
        name = n;
    }

    void displayStaff() {
        System.out.println("CODE : " + code);
        System.out.println("NAME : " + name);
    }
}
