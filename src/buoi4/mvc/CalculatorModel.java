package buoi4.mvc;

import buoi4.mvc.observer.Publisher;

public class CalculatorModel extends Publisher{
    //field
    private double result;

    //method

    public void add(double a, double b) {
        this.result = a + b;
        changeState();
    }

    public void sub(double a, double b) {
        this.result = a - b;
    }

    public double getResult() {
        return result;
    }

    public void changeState() {
        notifySubcribers();
    }

}
