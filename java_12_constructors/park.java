package java_12_constructors;

class park {
    double length;
    double breadth;
    double area;

    park(double l, double b) {
        length = l;
        breadth = b;
        area = length * breadth;
    }

    void display() {
        System.out.println("Length = "+length);
        System.out.println("Breadth ="+ breadth);
        System.out.println("Area = "+area);

    }
    public static void main(String[] args){
        park p1= new park(40,60);
        p1.display();
    }
}
