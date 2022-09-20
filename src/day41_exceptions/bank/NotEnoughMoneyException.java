package day41_exceptions.bank;

public class NotEnoughMoneyException extends RuntimeException{ // to make an unchecked exception we have to extend Runtime Exception class

    public NotEnoughMoneyException(){
        super("Not Enough Money in the account");
    }
}
