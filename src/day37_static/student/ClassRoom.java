package day37_static.student;

public class ClassRoom {

    public static void main(String[] args) {

        CydeoStudent.schoolInfo();

        CydeoStudent mayila =new CydeoStudent("Mayila", "Toronto", 2);

        System.out.println(mayila);

        mayila.drink();
        System.out.println(mayila.myCoffee.amountLeft);

        CydeoStudent aili = new CydeoStudent("Aili" , "Ottawa", 1);
        System.out.println( aili.myCoffee.amountLeft);
        aili.drink();
        aili.drink();
        aili.drink();
        System.out.println( aili.myCoffee.amountLeft);


    }
}
