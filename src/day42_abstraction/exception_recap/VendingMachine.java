package day42_abstraction.exception_recap;

public class VendingMachine {

    /*
    1.Chips
    2.Gum
    3.Candy
     */

    public static String select(int selection){

        String item = "";

        if(selection == 1){
            item = "Chips";
        }else if(selection == 2){
            throw new OutOfStockException();//causes exception to happen . The exception we created ourself
        }else if(selection == 3){
            item = "Candy";
        }

        return item;

    }

    public static String selectValid(int selection)throws InvalidSelectionException{ // to fix the problem

        String item = "";

        if(selection == 1){
            item = "Chips";
        }else if(selection == 2){
            item = "Gum";
        }else if(selection == 3){
            item = "Candy";
        }else {
            throw new InvalidSelectionException(); // checked exception, must be handled nu we do not need to handle it here
        }

        return item;

    }
}
