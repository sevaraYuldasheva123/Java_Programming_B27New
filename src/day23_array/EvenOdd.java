package day23_array;

public class EvenOdd {

    public static void main(String[] args) {

        int[] nums = {3 ,5, 12, 12, 5, 12, 4, 2};

        int even = 0;

        int odd = 0;


        for (int eachNum: nums){

            if(eachNum % 2 ==0){
                even ++;

            }else {
                odd++;
            }

        }

        System.out.println(nums);
        System.out.println("Even numbers: "+even);
        System.out.println("Odd numbers: "+odd);




    }
}
