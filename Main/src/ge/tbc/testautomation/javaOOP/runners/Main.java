package ge.tbc.testautomation.javaOOP.runners;

import ge.tbc.testautomation.javaOOP.figures.Rectangle;
import ge.tbc.testautomation.javaOOP.figures.Triangle;

import static ge.tbc.testautomation.javaOOP.util.HelperFunctions.compareRectangles;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5.0, 4.0);
        Triangle triangle = new Triangle(6.0, 7.0, 2.0, 4.0);
        Rectangle rectangle2 = new Rectangle(3.0, 5.0);

        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());

        compareRectangles(rectangle, rectangle2);
    }
}
