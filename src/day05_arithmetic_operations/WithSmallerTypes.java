package day05_arithmetic_operations;

public class WithSmallerTypes {

    public static void main(String[] args) {

        byte b1 = 5;
        byte b2 = 4;

        System.out.println(b1+b2); // 9 printed no problem there

       // byte b3 = b1+b2;  will not compile, during colculation values are counted in int so result becomes int

        //solution 1

        int i = b1+b2;  //  <---- preferable way

        //solution 2
        byte b3 = (byte) (b1+b2); // if we want to keep it as byte anyway we have to convert and group

    }
}
