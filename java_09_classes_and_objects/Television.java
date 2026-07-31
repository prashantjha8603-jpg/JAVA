package java_09_classes_and_objects;

class Television {
    String Make;
    String Purchase_Date;
    boolean Color_TV;
    int Screen_Size;

    void display() {
        System.out.println("Television made by " + Make);
        System.out.println("Color TV : " + Color_TV);
        System.out.println("Size of the Screen is " + Screen_Size +"cm");
        System.out.println("Purchace date of TV is " + Purchase_Date);
    }

    public static void main(String[] args) {
        Television tv = new Television();
        tv.Make = "Lg";
        tv.Purchase_Date = "26-09-2024";
        tv.Color_TV = true;
        tv.Screen_Size = 77;
        tv.display();
    }
}
