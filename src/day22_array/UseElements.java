package day22_array;

public class UseElements {

    public static void main(String[] args) {

        int[] nums = {4, 5, 12};
        System.out.println(nums.length); // to know how many elements are on the array

        System.out.println(nums[0] + nums[1]); // will return 9 --> 4 + 5

        String[] str = {"Hello", "World", "java", "code"};
        System.out.println(str.length);
        System.out.println(str[2].concat(" ").concat(str[3]));
    }
}
