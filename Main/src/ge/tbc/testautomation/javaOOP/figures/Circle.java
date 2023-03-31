package ge.tbc.testautomation.javaOOP.figures;

import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IResizableCircle;
import ge.tbc.testautomation.abstractClassesInterfaces.interfaces.IValidCircle;

public class Circle extends Figures implements IResizableCircle, IValidCircle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getLength() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void printPackageName() {
        System.out.println(this.getClass().getPackage().getName());
    }

    @Override
    public Circle returnDoubleSizedCircle(Circle circle) {
        double radius = circle.getRadius() * 2;
        Circle newCircle = new Circle(radius);
        return newCircle;
    }

    @Override
    public Circle returnCustomSizedCircle(Circle circle, double byvValue) {
        double radius = circle.getRadius() * byvValue;
        Circle newCircle = new Circle(radius);
        return newCircle;
    }

    @Override
    public boolean validateCircle(Circle circle) {
        double radius = circle.getRadius();
        if (radius > 0) {
            return true;
        } else {
            return false;
        }
    }
}
