package day20_loops;

public class CountHi {

    public static void main(String[] args) {

        String s = "abhicdhelhilofrhiiday";

        //counting how many times hi is in the string

        //approach 1 : while loop and delete the first occurrence each time
        int count = 0;
        while (s.contains("hi")){
            System.out.println(s);
            count++;
            s = s.replaceFirst("hi", "");
        }
        System.out.println(count);

        //aproach 2 : for loop to check one index at a time , but when the is hi we will check another index

        String s2 = "abhicdhelhilofrhiiday";

        int count2 = 0;

        for(int i = 0; i < s2.length()-1; i++){

            if (s2.charAt(i)=='h' && s2.charAt(i+1)=='i'){
                count2++;
            }

        }
        System.out.println(count2);

        //aproach 3 --> using indexes to check every 2 characters

        String s3 = "abhicdhelhilofrhiiday";

        int count3 = 0;

        for(int i = 0; i < s3.length()-1; i++){

            if (s3.substring(i, i+2).equals("hi")){
                count3++;
            }

        }
        System.out.println(count3);



    }
}
