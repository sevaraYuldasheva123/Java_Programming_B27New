package day29_methods;

public class ExtraPractice {

    public static void main(String[] args) {

        int[] nums = {1, 24, 5, 12};
        System.out.println(sumFromArray(nums));

        System.out.println(currencyConverter("yen", 100));

        System.out.println(currencyConverter("sums", 100));
    }

    public  static int sumFromArray(int[] nums){

        int sum = 0;

        for(int eachNum: nums){
            sum += eachNum;
        }
        return sum;


    }

    public static double currencyConverter(String type, double dollar){

        double converted = 0.0;

        switch (type.toLowerCase()){
            case "euro":
                converted = dollar * 0.91;
                break;
            case "yen":
                converted = dollar * 121.03;
                break;
            case "lira":
                converted = dollar * 14.85;
                break;
            case "won":
                converted = dollar * 1_217.52;
                break;
            case "repee":
                converted = dollar * 181.45;
                break;
            default:
                System.out.println("Unknown currency type: "+ type);

        }
        return converted;


    }
}
