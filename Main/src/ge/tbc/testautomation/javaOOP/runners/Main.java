package ge.tbc.testautomation.javaOOP.runners;

import ge.tbc.testautomation.javaOOP.figures.Circle;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    static Circle circle = new Circle(2.0);
    static Circle circle1 = new Circle(1.0);
    static Circle circle2 = new Circle(3.0);
    static Circle circle3 = new Circle(2.0);

    public static void main(String[] args) {
        System.out.println(circle.compareTo(circle1));
        System.out.println(circle.compareTo(circle2));
        System.out.println(circle.compareTo(circle3));

        TreeSet<Circle> newTreeSet = new TreeSet<>();
        newTreeSet.add(new Circle(13.0));
        newTreeSet.add(new Circle(2.0));
        newTreeSet.add(new Circle(3.0));
        newTreeSet.add(new Circle(6.0));
        newTreeSet.add(new Circle(5.0));
        newTreeSet.add(new Circle(6.0));
        newTreeSet.add(new Circle(9.0));
        newTreeSet.add(new Circle(4.0));
        newTreeSet.add(new Circle(9.0));
        newTreeSet.add(new Circle(12.0));
        System.out.println("TreeSet: " + newTreeSet);

        Set<Circle> newSet = new HashSet<>();
        newSet.add(circle);
        newSet.add(circle);
        newSet.add(new Circle(15.0));
        newSet.add(new Circle(15.0));
        newSet.add(new Circle(18.0));
        newSet.add(new Circle(9.0));
        newSet.add(new Circle(10.0));
        newSet.add(new Circle(8.0));
        newSet.add(new Circle(4.0));
        newSet.add(new Circle(7.0));
        System.out.println("HashSet: " + newSet);
    }
}

