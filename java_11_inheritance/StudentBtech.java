package java_11_inheritance;

class student {
    String name;
    int rollNo;
    String address;

    student(String name, int rollNo, String address) {
        this.name = name;
        this.rollNo = rollNo;
        this.address = address;
    }
}

class Btech_Student extends student {
    String department;
    int Semester;

    Btech_Student(String name, int rollNo, String address, String department, int Semester) {
        super(name, rollNo, address);
        this.department = department;
        this.Semester = Semester;
    }

    void display() {
        System.out.println("____Student Details____");
        System.out.println("Student Name : " + name);
        System.out.println("Roll Number : " + rollNo);
        System.out.println("Address : " + address);
        System.out.println("Student Semester : " + Semester);
        System.out.println("Student Department : " + department);

    }
}

public class StudentBtech {
    public static void main(String[] args) {
        Btech_Student s1 = new Btech_Student("Prashant Kumar", 40, "Mathura", "CSE", 3);
        s1.display();
    }
}
