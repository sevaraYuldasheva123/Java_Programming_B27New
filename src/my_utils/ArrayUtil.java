package my_utils;

public class ArrayUtil {

    /*
    Group of utility methods for arrays

     */

    //1 MIN---> create array that accepts int array and return smallest number from the array

    public static int minFromArray(int... arr){ // -->same as int[] arr

        int min = arr[0];

        for(int each: arr){
            if(each < min){
                min = each;
            }
        }
        return min;

    }

    //2 MAX---> create array that accepts int array and return biggest number from the array

    public static int maxFromArray(int... arr){ // -->same as int[] arr
        int max = arr[0];

        for(int each: arr){
            if(each > max){
                max = each;
            }
        }
        return max;
    }

    //3. Contains method --> check if array contains specific int
    public static boolean containsFromArray(int[] arr, int num){

        for(int each : arr ){

            if (each == num){
                return true;
            }
        }

        return false; // if the number did not match return false

    }
    //4. Index of , accept in t array and num, will return its index
    public static int indexOf(int[] arr, int num){

        for (int i = 0; i < arr.length; i++){

            if(arr[i] == num){
                return i;
            }

        }

        return -1; // if i go through whole array and dont find num at all, if no number in array in that case it will return -1 by default
    }
    //4.1 --> same as above but overloaded method for first accurence from certain index

    public static int indexOf(int[] arr, int target, int startIndex){
        for(int i = startIndex; i < arr.length; i++){
            if(arr[i] == target){ // every number from the array with the number we are look for
                return i;
            }
        }

        return -1;
    }

    //5. Add Element to an array --> accepts String array , adds String elemnt
    public static String[] addStringElement(String[] arr, String element){
        String[] newArr = new String[arr.length+1]; // create an array with extra size

        for (int i = 0; i < arr.length; i++){

            newArr[i] = arr[i];// will take element on index i from arr and add to new arr

        }
        newArr[newArr.length-1] = element; // add new element to new arr on last index
        return newArr;
    }
    //5.1 Add Element --> overloaded --> adding multiple arrays in one array
    public static String[] addStringElement(String[] original, String [] other){

        String[] merged = new String[original.length + other.length];

        for (int i = 0; i < original.length; i++){
            merged[i] = original[i];
        }

        for (int i = 0; i < other.length; i++){
            merged[original.length+i] = other[i];
        }

        return merged;

    }
}
