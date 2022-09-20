package day10_if_statements;

public class LetterType {

    public static void main(String[] args) {

        // find out if the variable is letter, number or special c
        char c = '!';
                                //first condition                       //second condition
        boolean isLetter = (c >= 'A' && c <='Z') || (c>= 'a' && c <= 'z'); // giving the range

        boolean isNumber = c >='0' && c <= '9' ;

        if(isLetter) {
            System.out.println(c + " is a letter");
        }
        if(isNumber){
            System.out.println(c + " is number");
        }
        if(!isLetter && !isNumber){
            System.out.println(c + " is special character");
        }
    }
}
