package day35_custom_classes.carpet;

public class Carpet {

    double width;
    double length;
    double unitPrice;
    boolean isPersian;
    double totalPrice;

    // 4 inputs , total price will be calculated
    public Carpet(double inputWidth, double inputLength, double inputUnit, boolean inputPersian){

        // assigning the instance variables inside the constructor
        width = inputWidth;
        length = inputLength;
        unitPrice = inputUnit;
        isPersian = inputPersian;
        calculatePrice(); // calling this method right away when constructor is called
    }

    public void calculatePrice(){

        totalPrice = length * width * unitPrice;
        if (isPersian){
            totalPrice += 200;
        }

    }

    @Override
    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice= $" + unitPrice +
                 ", "+ (isPersian? "Persian" : "Regular") + " carpet "+
                ", totalPrice= $" + totalPrice +
                '}';
    }
}
