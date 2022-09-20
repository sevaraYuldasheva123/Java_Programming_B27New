package day39_inheritance.pizza;

public class Pizza {

    private  String size;
    private  int numberOfToppings;

    public Pizza(String size, int numberOfToppings){
        setSize(size);
        setNumberOfToppings(numberOfToppings);
    }

    public String getSize(){
        return size;
    }

    public void setSize(String size){

        if(size.equalsIgnoreCase("small") || size.equalsIgnoreCase("medium") || size.equalsIgnoreCase("large")){
            this.size = size;
        }
    }

    public int getNumberOfToppings(){
        return numberOfToppings;
    }

    public void setNumberOfToppings(int numberOfToppings){

        if(numberOfToppings >= 0){
            this.numberOfToppings = numberOfToppings;
        }

    }

    public double calculatePrice(){

        if(size != null){
            return (size.equals("small") ? 4 : size.equals("medium") ? 6 : 8 ) + numberOfToppings * 0.75;
        }
        return -1; // if smth doesnt exist we return negative one (no logic in it just our decision)
    }

    public String toString(){

        return "Size: "+ size +", Number of toppings: "+ numberOfToppings+", total price: $"+calculatePrice();

    }
}
