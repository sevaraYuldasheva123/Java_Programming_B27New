package day02_print_statements;


public class escapeEample {

    public static void main(String[] args) {

        //System.out.println(" Today is "Friday" "); NOT A VALID CODE

        System.out.println(" Today is \"Friday\" ");

        System.out.println("\\"); // will print only \

        System.out.println("\t\thello");  // tab --> print will be moved

        System.out.println("shopping list : \n 1. milk \n 2. chips \n 3. water"); // new line for each

        System.out.println("shopping list : \n\t 1. milk \n\t 2. chips \n\t 3. water"); // new line for each as well as tab(will move right
    }
}
