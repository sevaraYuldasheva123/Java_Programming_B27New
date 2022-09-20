package homework;

public class Walking {

    public static void main(String[] args) {

        /*
        create a class Walking
  declare and assign a boolean variable is raining
  declare and assign a temperature variable
  check if you should go for a walk. You should go for a walk if it is not raining and the temperature is more than 68
         */

        boolean isRaining = true;
        int temperature = 67;

        boolean canWalk = isRaining && temperature>68;

        System.out.println(canWalk);
    }
}
