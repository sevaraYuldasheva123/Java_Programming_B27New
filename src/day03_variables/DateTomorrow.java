package day03_variables;

public class DateTomorrow {

    public static void main(String[] args) {

        /*
        declare and assing 3 variables, all numbers
        month , date , year
        print the date in this format:
        Date : month \ day \ year

        also update the day for tomorrow date and print it
        Tomorrows date : month \ day \ year

         */
        int month = 6;
        int date = 13;
        int year = 2022;

        System.out.println("Date : "+ month+"\\"+date+"\\"+year);

        date = 14;

        System.out.println("Tomorrow`s date : "+ month+"\\"+date+"\\"+year);

    }
}
