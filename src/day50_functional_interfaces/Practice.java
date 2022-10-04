package day50_functional_interfaces;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Practice {

    public static void main(String[] args) {

           /*
        Use Predicate Functional interface to:
            1.1 Create a function that can verify if a number contains duplicate digits
         */

        Predicate<Integer> duplicateDigits = p -> {
            String strNum = String.valueOf(p) ;  //same as --> "" + p

            Set<String> set = new HashSet<>(Arrays.asList(strNum.split("")));

            return strNum.length() != set.size();
        };
        System.out.println(duplicateDigits.test(1232));

        //Consumer: 1.2 Create a function that prints the middle character/s of a String
        Consumer<String> middleChars = str ->{
            int len = str.length();
            if (len % 2 == 0){
                System.out.println(str.substring(len/2 - 1, len/2+1));
            }else {
                System.out.println(str.charAt(len/2));
            }
        };

        middleChars.accept("panda");
        middleChars.accept("banana");


        //Function: 1.1 Create a function that can return the sum of digits from a string that contains number digits

        //String is Parameter, Integer is the return type
        Function<String, Integer> sumOfDigits = s -> {
            int sum = 0;

            for (int i=0; i < s.length(); i++){
                sum+= Integer.parseInt(s.substring(i, i+1));
            }

            return sum;
        };
        System.out.println("sumOfDigits.apply(\"425\") = " + sumOfDigits.apply("425"));
        System.out.println(sumOfDigits.apply("9184"));

    }

}
