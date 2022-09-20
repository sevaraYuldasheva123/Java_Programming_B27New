package day35_custom_classes;

public class LocalVersusInstance {

    // instance variables --> belong to the object
    int a = 5;
    int b = 10;

    public  LocalVersusInstance(int a , int z){

        // local variables --> belong to the constructor
        //a = a; // local a is prioritized which means here we are reassigning the local variable to itself but that means the instance a did not change
        this.a = a; // this is the keyword  in order to assign the local variable to instance variable with the same exact name
        b = z;
    }

    public void print(){
        System.out.println(a);
    }

    public static void main(String[] args) {

        LocalVersusInstance obj = new LocalVersusInstance(20,50);
        System.out.println(obj.a);
        System.out.println(obj.b);
    }
}
