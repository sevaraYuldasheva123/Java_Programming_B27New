package day41_exceptions.season;

public class Season {

    String name;
    double highestTemp;
    double lowestTemp;

    public Season(String name, double dighestTemp, double lowestTemp) {
        this.name = name;
        this.highestTemp = dighestTemp;
        this.lowestTemp = lowestTemp;
    }

    public void activity(){
        System.out.println("Generic Season");
    }

    public String toString(){

        return name + " season with the highest temperature of: "+ highestTemp+ " and lowest temperature of: "+lowestTemp;

    }
}
