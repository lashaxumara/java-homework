package ge.tbc.testautomation.javaOOP.runners;

import ge.tbc.testautomation.javaOOP.figures.Circle;
import ge.tbc.testautomation.javaOOP.util.Util;

public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(generateDouble());
        System.out.println(Circle.numberOfCircleInstances);
        Circle circle2 = new Circle(generateDouble());
        System.out.println(Circle.numberOfCircleInstances);
        Circle circle3 = new Circle(generateDouble());
        System.out.println(Circle.numberOfCircleInstances);
        Circle circle4 = new Circle(generateDouble());
        System.out.println(Circle.numberOfCircleInstances);
        Circle circle5 = new Circle(generateDouble());
        System.out.println(Circle.numberOfCircleInstances);

        String circle1String = Util.circleToString(circle1);
        String circle2String = Util.circleToString(circle2);
        String circle3String = Util.circleToString(circle3);
        String circle4String = Util.circleToString(circle4);
        String circle5String = Util.circleToString(circle5);
        System.out.println(circle1String);
        System.out.println(circle2String);
        System.out.println(circle3String);
        System.out.println(circle4String);
        System.out.println(circle5String);
    }

    public static double generateDouble() {
        double genDouble = Math.random() * 100;
        return genDouble;
    }
}
