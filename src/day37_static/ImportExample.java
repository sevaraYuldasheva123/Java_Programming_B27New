package day37_static;
//import static java.lang.Math.PI; TO ACCESS PI

import java.util.Arrays;

import  static  java.lang.Math.*; //to access everything from that class
import static  java.lang.Integer.*;
import  static  java.util.Arrays.*;

public class ImportExample {

    public static void main(String[] args) {

        System.out.println(Math.PI);
        System.out.println(Integer.MAX_VALUE);

        System.out.println(PI); // static import lets us use the static variables and members directly

       //System.out.println(max(4, 1));
        System.out.println(parseInt("123"));

        String str1 = "1234";
        int num = parseInt(str1);
        System.out.println(num);

        int [] a = {43, 4, 2};

        sort(a);
        System.out.println(Arrays.toString(a));

    }
}
