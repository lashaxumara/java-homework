package ge.tbc.testautomation.javaOOP.figures;

public class Circle implements Comparable<Circle> {


    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.valueOf(radius);
    }

    @Override
    public int compareTo(Circle otherCircle) {
        return Double.compare(this.radius,otherCircle.getRadius());

    }
}