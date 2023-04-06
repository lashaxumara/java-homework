package ge.tbc.testautomation.javaOOP.runners;

import java.util.*;

public class ContainersAndComparing {
    public static void main(String[] args) {


        ArrayList<String> phoneNumbers = new ArrayList<>();
        String[] numbers = {"555-542-231", "555-887-987", "555-161-143", "555-189-667"};
        phoneNumbers.addAll(Arrays.asList(numbers));
        for (String nn : phoneNumbers) {
            System.out.println(nn);
        }


        Iterator<String> nnIN = phoneNumbers.iterator();
        while (nnIN.hasNext()) {
            String numberIter = nnIN.next();
            System.out.println(numberIter);
        }

        ArrayList<String> myNames = new ArrayList<>();
        String[] name = {"Lasha", "Giorgi", "Ana", "Mariami"};
        myNames.addAll(Arrays.asList(name));

            
    }


}










