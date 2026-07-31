package java_11_inheritance;

public class Officer extends Staff {
    String grade;

    void setOfficer(String g) {
        grade = g;
    }

    void displayOfficer() {
        displayStaff();
        System.out.println("Grade : " + grade);
    }
}
