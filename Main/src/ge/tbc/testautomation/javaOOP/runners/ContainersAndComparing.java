package ge.tbc.testautomation.javaOOP.runners;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class ContainersAndComparing {
    public static void main(String[] args) {


        ArrayList<String> phoneNumbers = new ArrayList<>();
        phoneNumbers.add("555-542-231");
        phoneNumbers.add("555-887-987");
        phoneNumbers.add("555-161-143");
        phoneNumbers.add("555-189-667");
        for (String numbers : phoneNumbers) {
            System.out.println(numbers);
        }


        Iterator<String> numbers = phoneNumbers.iterator();
        while (numbers.hasNext()) {
            String phoneNumber = numbers.next();
            System.out.println(phoneNumber);
        }

        HashMap<String, String> namesAndNumbers = new HashMap<>();
        namesAndNumbers.put("lasha", "555-542-231");
        namesAndNumbers.put("giorgi", "555-887-987");
        namesAndNumbers.put("ilia", "555-161-143");
        namesAndNumbers.put("ana", "555-189-667");

        for (Map.Entry<String, String> getOut : namesAndNumbers.entrySet()) {
            String names = getOut.getKey();
            String number = getOut.getValue();
            if (number.contains("8")) {
                System.out.println(names + number);
            }
        }
    }
}
