package day47_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RemoveLength {

    public static void main(String[] args) {

        Set <String> words = new HashSet<>(Arrays.asList("one", "two", "java",
                "world", "automation", "soft skills", "lunch"));
        System.out.println(words);

        Iterator<String> it = words.iterator();
        while (it.hasNext()){ // while iterator has another element
            if (it.next().length() <= 4){
                it.remove();
            }
        }
        System.out.println(words);

    }
}
