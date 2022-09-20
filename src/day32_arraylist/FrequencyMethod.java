package day32_arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class FrequencyMethod {

    public static void main(String[] args) {

        ArrayList<Character> letters = new ArrayList<>(Arrays.asList('a', 'e', 'e', 'a', 'e', 't', 'p', 'i', 'o', 'o'));

        System.out.println(Collections.frequency(letters , 'e'));
        System.out.println(Collections.frequency(letters , 'z'));

        String s = "aabbbabeiffca";
        ArrayList <String> list = new ArrayList<>(Arrays.asList(s.split("")));
        System.out.println(list);

        int aFrequency = Collections.frequency(list, 'a');
        System.out.println(aFrequency);








    }
}
