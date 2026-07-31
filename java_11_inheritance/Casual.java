package java_11_inheritance;

public class Casual extends Typist {
    double DailyWages;

    void setCasual(double w) {
        DailyWages = w;
    }

    void displayCasual() {
        displayTypist();
        System.out.println("Daily Wages : " + DailyWages);
    }
}
