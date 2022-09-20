package day05_arithmetic_operations;

public class Pizza {

    public static void main(String[] args) {

        String type  = "Cheese";
        int slices = 12;
        int people = 5;
        int slicesPerPerson = slices/people;
        int leftOverSlices = slices%people;

        System.out.println(people +" people are going to eat the "+ type+" pizza. Every person will get "
                +slicesPerPerson+" , and there will be "+leftOverSlices+" left over");
    }
}
