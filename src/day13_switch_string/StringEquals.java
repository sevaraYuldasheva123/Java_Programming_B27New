package day13_switch_string;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class StringEquals {

    public static void main(String[] args) {

        //both of them string litterals and both located in string pool
        String s = "java";
        String s2 = "java";

        System.out.println(s.equals(s2)); // comparing the values of the string

        int x = 8;
        int y = x++;

        System.out.println(x+ "+" +y);

        if(--x > y){

        }


    }
}
