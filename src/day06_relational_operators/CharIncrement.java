package day06_relational_operators;

public class CharIncrement {

    public static void main(String[] args) {

        //post increment --> value is printed, and updated after
        char letter = 'A';
        System.out.println("letter = " + letter);

        System.out.println(letter++); // at this point char is printed first, updated after --> A now, B after
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);
        System.out.println(letter++);

        System.out.println();

        //pre increment --> value is changed immediately
        char letter2 = 'a';
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);
        System.out.println(++letter2);

        System.out.println();

        char digit = '9';
        System.out.println(digit--);//9
        System.out.println(digit--);//8
        System.out.println(digit--);//7
        System.out.println(digit--);//6
        System.out.println(digit--);//5



    }
}
