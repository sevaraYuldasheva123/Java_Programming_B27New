package day30_practice_wrapper;

import my_utils.ArrayUtil;

import java.util.Arrays;

public class UsingArraysUtilClass {

    public static void main(String[] args) {

        System.out.println(ArrayUtil.minFromArray(-1,0,1,2,3,4));

        System.out.println(ArrayUtil.maxFromArray(1,2,3,4,5,6,7));

        int[] nums = {4, 5, 12, 5, 14};
        System.out.println(ArrayUtil.containsFromArray(nums, 13));

        int[] nums2 = {4, 2, 5, 1, 6};
        System.out.println(ArrayUtil.indexOf(nums2, -5));

        int nums3[] = {4, 5, 1, 6, 1, 6, 3, 5, 4, 1};
        System.out.println(ArrayUtil.indexOf(nums3, 6));
        System.out.println(ArrayUtil.indexOf(nums3, 6, 4));

        String[] words = {"Java", "is", "the", "best"};
        words = ArrayUtil.addStringElement(words, "language");
        System.out.println(Arrays.toString(words));

        System.out.println();

        String[] str1 = {"today", "is", "tuesday"};
        String[] str2 = {"no", "softskill", "today"};

        String[] combinedArray = ArrayUtil.addStringElement(str1, str2);
        System.out.println(Arrays.toString(combinedArray));

    }
}
