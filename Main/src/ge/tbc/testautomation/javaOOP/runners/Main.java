package ge.tbc.testautomation.javaOOP.runners;

import ge.tbc.testautomation.exceptionsStringOperationsRegex.LimitException;
import ge.tbc.testautomation.exceptionsStringOperationsRegex.RadiusException;
import ge.tbc.testautomation.javaOOP.figures.Circle;
import ge.tbc.testautomation.javaOOP.figures.Figure;

public class Main {
    public static void main(String[] args) {


        try {
            Circle radius1 = new Circle(3.0);
            System.out.println(Figure.numberOfInstances);
            Circle radius2 = new Circle(1.0);
            System.out.println(Figure.numberOfInstances);
            Circle radius3 = new Circle(2.0);
            System.out.println(Figure.numberOfInstances);
            Circle radius4 = new Circle(6.0);
            System.out.println(Figure.numberOfInstances);
            Circle radius5 = new Circle(4.0);
            System.out.println(Figure.numberOfInstances);
        } catch (LimitException e) {
            System.out.println(e.getMessage());
        }


        try {
            Circle radius6 = new Circle(-3.0);
            System.out.println(radius6);
        } catch (RadiusException e) {
            System.out.println(e.getMessage());

        }
        String literal = "Test Automation Bootcamp 6, 2022";
        System.out.println(literal.substring(5, 15).toLowerCase());

        String[] split = literal.split(" ");
        for (String Splited : split) {
            System.out.println(Splited);
        }

        System.out.println(literal.length());


        String spaceReplace = literal.replaceAll(" ", "-");
        System.out.println(spaceReplace);

        String[] numbers = {"599-144-155", "555-423-256", "571-150-203", "598-164-345"};
        for (String number : numbers) {
            boolean validation = phoneNumberValidation(number);
            System.out.println(validation);
        }
    }

    private static boolean phoneNumberValidation(String phoneNumber) {
        phoneNumber = phoneNumber.replaceAll("-", "");

        String pattern = "^(555|595|592|599)\\d{6}$";
        return phoneNumber.matches(pattern);
    }
}

