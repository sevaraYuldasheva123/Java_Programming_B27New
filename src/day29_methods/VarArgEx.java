package day29_methods;

public class VarArgEx {

    public static void main(String[] args) {

        int[] a = {1,2,3,4,5};
        printAll(a);
        dynamic(1,2,3,4,5);


    }

    public static void printAll(int[] nums){

        for(int each : nums){
            System.out.print(each+ " ");
        }
        System.out.println();
    }

    public static void dynamic(int ... nums){

        for(int each : nums){
            System.out.print(each+ " ");
        }
        System.out.println();
    }
}
