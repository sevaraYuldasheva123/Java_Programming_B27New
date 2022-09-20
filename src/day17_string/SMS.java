package day17_string;

import java.text.AttributedString;

public class SMS {

    public static void main(String[] args) {

          /*
    [SMS parts] - We will do this together

    Given a String in the following format:
    Sender: <James Bond>. From Number: [202-123-3456]. + Message: {"I love programming and problem solving"}

    Separate these parts and print them separately:
    Sender: actualSender
    Number: actualNumber
    Message: actualMessage
     */

        String fullMessage = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {\"I love programming and problem solving\"}";

        int indexOfFirstSender = fullMessage.indexOf('<');
        int indexOfEndSender  = fullMessage.indexOf('>');

        int startNumber = fullMessage.indexOf('[');
        int endNumber = fullMessage.indexOf(']');

        int startMessage = fullMessage.indexOf('{');
        int endMessage = fullMessage.indexOf('}');

        String actualSender = fullMessage.substring(indexOfFirstSender +1, indexOfEndSender );
        String actualNumber = fullMessage.substring(startNumber+1, endNumber);
        String actualMessage = fullMessage.substring(startMessage+1, endMessage);

        System.out.println("actualSender = " + actualSender);
        System.out.println("actualNumber = " + actualNumber);
        System.out.println("actualMessage = " + actualMessage);
    }


}
