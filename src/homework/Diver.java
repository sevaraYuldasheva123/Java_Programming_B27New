package homework;

public class Diver {
    public static void main(String[] args) {
        /*
        You are diving in the ocean. Your oxygen tank has a certain level (number)

        declare and assign a int variable about the oxygen level in the tank and print a message based on the oxygen level:

            Above 90 - Your tank is full
            Above 80 - Still okay
            Above 70 - Don't go too far
            Above 60 - Start to head back
            Above 50 - Be careful now you at at 50%
         */

        int oxygenLevel =59;

        if(oxygenLevel >= 90){
            System.out.println("Your tank is full");
        }else if(oxygenLevel >= 80 && oxygenLevel <= 89){
            System.out.println("Oxygen level is still okay");
        }else if(oxygenLevel >=70 && oxygenLevel <= 79){
            System.out.println("Oxygen level is running low, Do not go too far");
        }else if(oxygenLevel >= 60 && oxygenLevel <= 69){
            System.out.println("Start to head back");
        }else if(oxygenLevel >= 50 && oxygenLevel<=59){
            System.out.println("Be carefull, you are now at 50 % of the oxygen level");
        }

    }
}
