package day16_strings;

public class DynamicIndexOf {

    public static void main(String[] args) {

        String str = "mississipi";
        //            0123456789
        // the goal is to find all the indexes of i character

        System.out.println("First i: "+ str.indexOf('i'));
        System.out.println("Middle i: "+ str.indexOf('i' , 4));
        System.out.println("Last i: "+ str.lastIndexOf('i'));

        System.out.println("dynamic");
        System.out.println();
        //dynamic one

        int firstI= str.indexOf('i');
        int secondI = str.indexOf('i', firstI+1); // from the position of first i
        //int lastI = str.lastIndexOf('i'); same as below
        int lastI = str.indexOf('i', secondI+1);// from the position of second i


        System.out.println("firstI = " + firstI);
        System.out.println("secondI = " + secondI);
        System.out.println("lastI = " + lastI);
    }
}
