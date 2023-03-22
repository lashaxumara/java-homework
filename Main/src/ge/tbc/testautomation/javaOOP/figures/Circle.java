package ge.tbc.testautomation.javaOOP.figures;

public class Circle {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
        numberOfCircleInstances++;
    }

    public static int numberOfCircleInstances = 0;
}
