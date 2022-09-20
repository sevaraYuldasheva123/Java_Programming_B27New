package day17_string;

public class MiddleChar {

    public static void main(String[] args) {

        String str = "air";
                //    01234
        //            length 5 / 2 = 2

        if (str.length()%2 == 1){ // str has an odd number of characters, 1 middle character

            int midIndex = str.length()/2;
            System.out.println("The middle char is: "+str.charAt(midIndex));

        }else {// str has an even number of characters, 2 middle character
            int firstMid = str.length() / 2 - 1;
            int secondMid =  str.length() / 2;
            System.out.println("The middle 2 characters are: "+ str.charAt(firstMid) + str.charAt(secondMid) );
        }
    }
}
