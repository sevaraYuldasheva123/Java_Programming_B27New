package day42_abstraction.exception_recap;

public class OutOfStockException extends RuntimeException{ // we are extending the Runtime exception
                                                            //create a runtime exception

    public OutOfStockException(){
        super("Item is Out Of Stock"); // calling the parent exception
                // the message helps us to see what kind of exception it is
    }


}
