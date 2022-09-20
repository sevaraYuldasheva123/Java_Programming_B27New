package day11_nested;

public class NestedExample {

    public static void main(String[] args) {

        boolean a = true;
        boolean b = true;

        if(a){ //if this is true run inside
            System.out.println(1);
            if (b){
                System.out.println(2);
            }
        }
    }
}
