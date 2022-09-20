package day26_multi_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Example1 {

    public static void main(String[] args) {

        char[] upper = {'R', 'J', 'A'};
        char[] lower = {'p','z', 'q', 'e'};
        char[] other = {'4', '#', '*', '$', '&'};

        char[][] chars = new char[3][]; // {upper, lower, other};  <--- would work too

        chars[0] = upper; //storing the upper char array as the first element of 2d array
        chars[1] = lower; //storing the lower char array as the second element of 2d array
        chars[2] = other; //storing the other char array as the third element of 2d array

        System.out.println(Arrays.toString(chars[0]));
        System.out.println(Arrays.toString(chars[1]));
        System.out.println(Arrays.toString(chars[2]));

        System.out.println(Arrays.deepToString(chars)); // this method prints muli dimensional arrays

    }
}
