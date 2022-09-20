package day11_nested;

public class AgeGroups {

    public static void main(String[] args) {

        /*
        age should be 0 - 120

        < 1 baby
        2 - 5 toddler
        6 - 13 kid
        14 - 18 young adult
        19 - 30 adult
        31 - 65 middle age adult
        > 65 senior

         */
        int age = -2;

        if(age >= 0 && age <= 120){//pre condition -- > valid age
                if(age <= 1){
                    System.out.println("Baby");
                }else if(age <= 5){
                    System.out.println("Toddler");
                }else if(age <= 13){
                    System.out.println("Young Kid");
                }else if(age <=18){
                    System.out.println("Teenager");
                } else if(age <= 40){
                    System.out.println("Adult");
                }else if(age <= 65){
                    System.out.println("Middle age adult");
                }else {
                    System.out.println("Senior");
                }

        }else {// --> invalid age
            if(age < 0){
                System.out.println("Ages can not be less then 0");
            }else {
                System.out.println("Ages can not be over 120");
            }
        }

    }
}
