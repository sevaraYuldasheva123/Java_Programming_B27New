package day42_abstraction.exception_recap;

public class InvalidSelectionException extends Exception { // extending the whole Exception class
                                                        // in order to make custom checked exception

    public InvalidSelectionException(){
        super("Selection can only be 1 , 2 or 3 only");
    }
}
