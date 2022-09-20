package day24_array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5};
        int [] reverse = new int[arr.length];

        int y = 0;// just adding one more variable in order to access the indexes of reversed one/ can also be declared separately
        for (int i = arr.length; i >= 0; i--){
            reverse[y] = arr[i];
            y++;

        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(reverse));
    }
}
