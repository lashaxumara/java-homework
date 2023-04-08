package ge.tbc.testautomation.javaOOP.runners;


import ge.tbc.testautomation.annotationsAndComparators.Rectangle;
import ge.tbc.testautomation.generic.AnyPair;
import ge.tbc.testautomation.generic.FigurePair;
import ge.tbc.testautomation.javaOOP.figures.Circle;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class Main {

    private static <K, D> AnyPair<Field[], Field[]> getDeclaredFields(K objOne, D objTwo) {
        Field[] fieldsOne = objOne.getClass().getDeclaredFields();
        Field[] fieldsTwo = objTwo.getClass().getDeclaredFields();
        return new AnyPair<>(fieldsOne, fieldsTwo);
    }

    public static void main(String[] args) {

        Integer num = 1;
        String str = "2";


        AnyPair<Field[], Field[]> anyPair = getDeclaredFields(num, str);


        Field[] fieldsOne = anyPair.getElementOne();
        Field[] fieldsTwo = anyPair.getElementTwo();

        List<Field> fieldListOne = Arrays.asList(fieldsOne);
        List<Field> fieldListTwo = Arrays.asList(fieldsTwo);

        System.out.println(fieldListOne);
        System.out.println(fieldListTwo);

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(5, 5);
        FigurePair<Circle, Rectangle> figurePair = new FigurePair<>(circle, rectangle);
        System.out.println(figurePair);
    }


}

