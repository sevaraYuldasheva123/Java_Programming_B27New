package day19_loops;

public class Polindrome {

    public static void main(String[] args) {

        String s = "racecar";
        String reverse = "";


        // reverse the string
        //from last index to first

        for (int i = s.length()-1; i >= 0; i--){

            reverse += s.charAt(i);
        }
        System.out.println(reverse);
        if (s.equals(reverse)){
            System.out.println("Polindrome");
        }else {
            System.out.println("Not polindrome");
        }

    }
}
