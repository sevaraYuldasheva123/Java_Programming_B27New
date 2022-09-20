package day07_scanner;

public class GiftCard {

    public static void main(String[] args) {

        /*
            create a class GiftCard

    declare and assign a gift card variable at 500
    declare and assign times used at 3
    print using giftcard and subtract 150 from the amount
    reduce the times used by one
    print using giftcard and subtract 99 from the amount
    reduce the time used by one
    print information at the end
         */

        double giftCard = 500;
        int uses = 3;

        System.out.println("Using gift card. 150 is charged");

        giftCard-=150; // giftCard = giftCard - 150;
        uses--;

        System.out.println("Using gift card. 99 is charged");

        giftCard-=99; // giftCard = giftCard - 150;
        uses--;

        System.out.println("Gift card balance : $"+ giftCard);
        System.out.println("Number of times left to use the card: "+uses);
    }
}
