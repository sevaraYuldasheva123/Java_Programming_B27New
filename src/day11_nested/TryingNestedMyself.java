package day11_nested;

public class TryingNestedMyself {

    public static void main(String[] args) {

        /*
        Going to school : high school, middle
        if age >= 7 all of the above
        if age <= 6 preschool
         */

        int age =6;
        String schoolType = "";

        if(age >= 3 && age <= 6){
            schoolType = "preschool";
        }else if(age > 6){

                    if(age >=7 && age <=11 ){
                        schoolType = "middleSchool";
                    }else if(age >=12 && age <= 16){
                        schoolType = "highschool";
                    }else if(age>=17 && age <= 22){
                        schoolType = "college";
                    }else {
                        schoolType = "no school type";
                    }

        }else{
            schoolType = "Too young to have any school type";
        }
        System.out.println("For provided age the school type is: "+schoolType);
    }
}
