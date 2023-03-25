package ge.tbc.testautomation.javaOOP.figures;

public class Rectangle extends Figure {
    private double a;
    private double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return (a + b) * 2;
    }



    @Override
    public double getArea() {
        return a * b;
    }
}




