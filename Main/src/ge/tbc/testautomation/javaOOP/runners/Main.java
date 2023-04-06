package ge.tbc.testautomation.javaOOP.runners;

import ge.tbc.testautomation.annotationsAndComparators.Analyzable;
import ge.tbc.testautomation.annotationsAndComparators.Rectangle;
import ge.tbc.testautomation.annotationsAndComparators.RectangleComparator;
import ge.tbc.testautomation.annotationsAndComparators.VariableNameAnnotation;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class Main {
    public static void main(String[] args) {

        Analyzable analize = new Analyzable();
        Field[] myFields = analize.getClass().getDeclaredFields();
        for (Field field : myFields) {
            if (field.isAnnotationPresent(VariableNameAnnotation.class)) {
                VariableNameAnnotation annotation = field.getAnnotation(VariableNameAnnotation.class);
                String annotatedName = annotation.name();
                String fieldName = field.getName();
                if (annotatedName.equalsIgnoreCase(fieldName)) {

                } else {
                    System.out.println("VARIABLE NAME MISMATCH FOUND.");
                }
            }
        }
        @SuppressWarnings("unused")
        int phoneNumber;
        @SuppressWarnings("unused")
        String customreName;

        ArrayList<Integer> randomNumbers = new ArrayList();
        Integer[] numbers = {3, 2, 6, 7, 9, 13, 16, 4, 8, 15};
        randomNumbers.addAll(Arrays.asList(numbers));
        Collections.sort(randomNumbers);
        System.out.println(randomNumbers);

        RectangleComparator rectangleComparator = new RectangleComparator();
        Rectangle rectangle = new Rectangle(7, 3);
        Rectangle rectangle1 = new Rectangle(6, 3);
        Rectangle rectangle2 = new Rectangle(9, 4);
        Rectangle rectangle3 = new Rectangle(7, 3);
        System.out.println(rectangleComparator.compare(rectangle, rectangle1));
        System.out.println(rectangleComparator.compare(rectangle, rectangle2));
        System.out.println(rectangleComparator.compare(rectangle, rectangle3));

        List<Rectangle> rectangleList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            int width = (int) (Math.random() * 10) + 1;
            int height = (int) (Math.random() * 10) + 1;
            rectangleList.add(new Rectangle(width, height));
        }

        Collections.sort(rectangleList, new RectangleComparator());
        System.out.println(rectangleList);
    }
}

