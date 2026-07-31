package java_11_inheritance;

public class StaffDemo {
    public static void main(String[] args) {
        System.out.println("Staff -> Teacher");
        Teacher t = new Teacher();
        t.setStaff(101, "Prakash");
        t.setTeacher("Math", "Pk Publication");
        t.displayTeacher();
        System.out.println();

        System.out.println("Staff -> Officer");
        Officer o = new Officer();
        o.setStaff(209, "Yamina");
        o.setOfficer("A");
        o.displayOfficer();
        System.out.println();

        System.out.println("Staff -> Typist -> Regular");
        Regular r = new Regular();
        r.setStaff(305, "Java");
        r.setTypist(205);
        r.displayRegular();
        System.out.println();

        System.out.println("Staff -> Typist -> Casual");
        Casual c = new Casual();
        c.setStaff(1109,"Shristi Negi");
        c.setTypist(37);
        c.setCasual(800);
        c.displayCasual();
    }
}
