package ge.tbc.testautomation.annotationsAndComparators;

import ge.tbc.testautomation.javaOOP.figures.Figures;

public class Rectangle extends Figures {
    private double a;
    private double b;

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    public double getArea() {
        return a * b;
    }

    @Override
    public double getLength() {
        return  (a + b)*2;
    }

    @Override
    public void printPackageName() {
        System.out.println(getClass().getPackage().getName());
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
