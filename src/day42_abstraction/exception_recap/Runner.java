package day42_abstraction.exception_recap;

public class Runner {

    public static void main(String[] args) {

        //System.out.println(VendingMachine.select(2)); causes the exception

        try {
            System.out.println(VendingMachine.selectValid(5));
        }catch (InvalidSelectionException e){
            System.out.println(e.getMessage());
        }


    }
}
