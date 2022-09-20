package day09_if_statements;

public class Outside {

    public static void main(String[] args) {

        double degrees = 62;

        if(degrees >= 72){
            System.out.println("It is nice weather, go outside!");
        }
        if(degrees<72){
            System.out.println("Stay inside, it is chilly!");
        }

        System.out.println("===========================");

        //if else
        if(degrees >= 72){
            System.out.println("It is nice weather, go outside!");
        }else {
            System.out.println("Stay inside, it is chilly!");
        }
    }
}
