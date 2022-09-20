package day40_inheritance.app;

public class Youtube extends App {

    public Youtube(double version){
        super("Youtube", version); // calling parent constructor
    }

    public void watchVideo(){
        System.out.println("Watching java tutorial");
    }


}
