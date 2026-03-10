package java_For_College_work;

public class student {
    static int x = 10;
    int age = 20;

    void xyz(int age, String name, float price) {
        //int z = 30;
        System.out.println(age);
        System.out.println(name);
        System.out.println(price);
        System.out.println(age);
        System.out.println(this.age);
        System.out.println(x);
    }

    public static void main(String[] args) {
        student obj = new student();
        obj.xyz(34, "student", 50.56f);
    }

}
