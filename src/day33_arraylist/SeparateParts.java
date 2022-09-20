package day33_arraylist;

import com.sun.tools.internal.ws.wsdl.document.soap.SOAPUse;

import java.util.ArrayList;
import java.util.Arrays;

public class SeparateParts {

    public static void main(String[] args) {

        String s = "ABCD123$%#@&456EFG";

        ArrayList<String> letters = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(letters);
        letters.removeIf(p -> !Character.isLetter(p.charAt(0))); // remove if character is not a letter
        System.out.println(letters);

        System.out.println();
        ArrayList<String> numbers = new ArrayList<>(Arrays.asList(s.split("")));
        numbers.removeIf(eachString -> !Character.isDigit(eachString.charAt(0)) );
        System.out.println(numbers);

        System.out.println();
        ArrayList<String> specialChars = new ArrayList<>(Arrays.asList(s.split("")));
        specialChars.removeAll(letters);
        specialChars.removeAll(numbers);
        System.out.println(specialChars);

        String str1 = "MOUNTAIN";
        System.out.println(str1.trim().substring(2, 9).toLowerCase());



    }
}
