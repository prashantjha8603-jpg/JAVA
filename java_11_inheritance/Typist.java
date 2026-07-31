package java_11_inheritance;

public class Typist extends Staff {
    int speed;

    void setTypist(int s) {
        speed = s;
    }

    void displayTypist() {
        displayStaff();
        System.out.println("Speed : " + speed + "wpm");
    }
}
