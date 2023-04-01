package ge.tbc.testautomation.javaOOP.runners;

import ge.tbc.testautomation.javaOOP.figures.Circle;

public class Main {

    public static void main(String[] args) {
        Circle circle = new Circle(10);
        System.out.println(circle.getLength());
        System.out.println(circle.getArea());
        circle.printPackageName();
        System.out.println(circle.validateCircle(circle));
        System.out.println(circle.returnDoubleSizedCircle(circle).getRadius());
        System.out.println(circle.returnCustomSizedCircle(circle, 5).getRadius());
    }
}

