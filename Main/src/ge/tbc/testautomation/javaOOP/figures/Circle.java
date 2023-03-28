package ge.tbc.testautomation.javaOOP.figures;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;

public class Circle extends Figure {
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
        if (radius > 0) {
            System.out.println("Radius is valid!");
        } else {
            throw new RadiusException("RADIUS VALUE NOT VALID");
        }

        if (numberOfInstances < 5) {
            System.out.println("numberOfInstances is less than 5");
        } else {
            throw new LimitException("INSTANTIATION LIMIT REACHED");
        }
    }


}
