package day38_encapsulation.bank;


public class TestBank {

    public static void main(String[] args) {

        ATM account1 = new ATM(213456789, 123_000);

        System.out.println(account1.getBalance());
        System.out.println(account1.getAccountNumber());
    }

}
