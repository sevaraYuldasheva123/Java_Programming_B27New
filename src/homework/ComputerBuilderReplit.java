package homework;
import  java.util.*;
public class ComputerBuilderReplit {


        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
            System.out.println("Select screen size:");
            String screenSize = input.nextLine();
            double finalPrice = 0;
            int screenSize13 = 200;
            int screenSize15 = 300;
            int screenSize17 = 400;
            switch (screenSize) {
                case "13.3":
                    finalPrice += screenSize13;
                    break;

                case "15.0":
                    finalPrice += screenSize15;
                    break;

                case "17.3":
                    finalPrice += screenSize17;
                    break;
            }
            System.out.println("Select CPU type:");
            String cpuType = input.nextLine();
            int i3 = 150;
            int i5 = 250;
            int i7 = 350;
            switch (cpuType) {
                case "i3":
                    finalPrice += i3;
                    break;

                case "i5":
                    finalPrice += i5;
                    break;

                case "i7":
                    finalPrice += i7;
                    break;
            }
            System.out.println("Select RAM size:");
            int ramSize = input.nextInt();
            int gb4 = (ramSize / 4) * 50;
            finalPrice += gb4;


            System.out.println("Select storage type:");
            String storageType = input.next();


            System.out.println("Select storage size:");
            int storageSize = input.nextInt();
            int hdd = (storageSize / 500) * 50;
            int ssd = (storageSize / 500) * 100;
            switch (storageType) {
                case "HDD":
                    finalPrice += hdd;
                    break;
                case "SSD":
                    finalPrice += ssd;
                    break;
            }
            System.out.println("Select screen resolution:");
            String screenResolution = input.next();
            int fullHd = 100;
            int k4 = 200;
            switch (screenResolution) {
                case "FULLHD":
                    finalPrice += fullHd;
                    break;
                case "4K":
                    finalPrice += k4;
                    break;

            }


            System.out.println("Final price is: " + "$" + finalPrice);


        }

        }

