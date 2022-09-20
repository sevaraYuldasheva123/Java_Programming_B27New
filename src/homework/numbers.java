package homework;

import java.sql.Array;
import java.util.Arrays;

public class numbers {

    public static void main(String[] args) {


        int[] nums = {34, 59,19};
        for(int i = 0; i < nums.length; i++){
            if(nums[i]==34){
                System.out.println("First element: "+ nums[i]);
            }else if(nums[i]==59){
                System.out.println("Second element: "+ nums[i]);
            }else if(nums[i] == 19){
                System.out.println("Third element: "+ nums[i]);

            }
            System.out.println(Arrays.toString(nums));
    }
    }
}
