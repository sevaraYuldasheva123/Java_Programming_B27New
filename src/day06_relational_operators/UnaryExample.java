package day06_relational_operators;

public class UnaryExample {

    public static void main(String[] args) {

        int n = 0;//0
        n++;//1 --> post increment

        System.out.println(n); // n = 1

        ++n; // pre increment n = 2
        System.out.println(n);

        System.out.println(++n); // pre increment ---> before running value becomes 3 and then that will be printed

        System.out.println(n++); // post increment ---> current value 3 prints first and after printing value becomes 4

        System.out.println(n); // here value is 4

        System.out.println("----------------------------");

        int x = 4;
        int y = x; //4
        int z = ++x; // 5 --> pre increment
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("----------------------------");


        int candy = 5;
        System.out.println("Your kid asks for candy, u have  "+ candy);
        System.out.println("You give 1 candy, so now u have "+ --candy ); // subtracted one and than printed --> 4

        System.out.println("Sibling comes in and want one, we check how many there, then give them one "+candy--); //prints 4, then subtracs 1

        System.out.println("Total candies left in jar: "+ candy);

        System.out.println("----------------------------");

        //we want to find how many times a is in my name
        int counter = 0;
        counter++;


    }
}
