package ge.tbc.testautomation.javaOOP.util;

import ge.tbc.testautomation.javaOOP.figures.Rectangle;

public class HelperFunctions {
    public static void compareRectangles(Rectangle rectangle, Rectangle rectangle1) {
        if (rectangle.getPerimeter() > rectangle1.getPerimeter()) {
            System.out.println("parameter 1 > parameter 2");
        } else if (rectangle.getPerimeter() == rectangle1.getPerimeter()) {
            System.out.println("parameter 1 = parameter 2");
        } else {
            System.out.println("parameter 1 < parameter 2");
        }


    }
}
