package day06_relational_operators;

public class UpdatingVariables {

    public static void main(String[] args) {

        int n =10;

        //reassigning a new value
        n=20;

        int a =3;
        a = a + 4;

        int b = 15;
        b+=9; //b = b+9;
        b+=1; //b = b+1;

        int z = 10;
        z++;
        System.out.println(z); // z = 11

        System.out.println();

        int java = 8;
        int testing = --java; // pre decrement

        System.out.println(java);// -->7
        System.out.println(testing);// -->7

        System.out.println();

        int x = 7;
        int y = x--; // post decrement

        System.out.println(x); // --> 6
        System.out.println(y); // --> 7




    }
}
