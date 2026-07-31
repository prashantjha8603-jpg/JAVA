package java_11_inheritance;

public class Teacher extends Staff {
    String sub;
    String publication;

    void setTeacher(String s, String p) {
        sub = s;
        publication = p;
    }

    void displayTeacher() {
        displayStaff();
        System.out.println("Subject : " + sub);
        System.out.println("Publication : " + publication);
    }

}
