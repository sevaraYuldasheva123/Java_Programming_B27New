package day44_polymorphism.animal;

public class Wild {

    public static void main(String[] args) {

        // all possible references for lizard

        Lizard lizard1 = new Lizard(); // reference to itself

        Reptile lizard2 = new Lizard(); // reference to direct super class

        Animal lizard3 = new Lizard();// reference to indirect parent class

        Object lizard4 = new Lizard(); // reference to Object which is super class for all objects


        lizard1.eat();
        lizard2.eat();
        lizard3.eat();
        //lizard4.eat(); will not work
    }
}
