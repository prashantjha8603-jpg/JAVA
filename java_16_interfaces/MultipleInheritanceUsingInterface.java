package java_16_interfaces;

interface Mother {
    void showMother();
}

interface Father {
    void showFather();
}

class child implements Mother, Father {
    @Override
    public void showMother() {
        System.out.println("Mother's Method");
    }

    @Override
    public void showFather() {
        System.out.println("Father's Method");
    }

    void display() {
        System.out.println("Child inherits both interfaces.");
    }
}

public class MultipleInheritanceUsingInterface {
    public static void main(String[] args) {
        child obj = new child();
        obj.showFather();
        obj.showFather();
        obj.display();
    }
}
