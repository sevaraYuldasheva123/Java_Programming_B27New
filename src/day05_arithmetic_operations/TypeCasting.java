package day05_arithmetic_operations;

public class TypeCasting {

    public static void main(String[] args) {

        byte b = 14;
        int i =b;//int is bigger so it will be done automatically. Implicit casting

        long l = 40; //40 is small number and by default it is int because it is whole number

        long l2 = 3000000000l;

        double d = 19.99;
        int i2 = (int)d; //double is bigger than int si I will need to cast it
        // output i2 = 19. int holds only whole numbers so it will print 19

        int i3 = 500;
        byte b2 = (byte) i3; // int is bigger than byte so i need to cast it
        System.out.println(b2); // nut byte cannot hold 500, number is too big so we will lose data in this case

        short s = 60;
        double d3 = s; //implicit casting --> done automatically --> output 60.0

        float f2 =  100.50f;
        long l3 = (long) f2;  // float is bigger than long --> downcasting --> output 100 (data loss)






    }
}
