package day09_if_statements;

public class LunchTime {

    public static void main(String[] args) {

        boolean isHungry = true;
        boolean isLunchTime = false;

        if(isLunchTime && isHungry){
            System.out.println("Time to take a break, go eat lunch");
        } else {
            System.out.println("The lunch break is not here yet, go practice more!");
        }


    }
}
