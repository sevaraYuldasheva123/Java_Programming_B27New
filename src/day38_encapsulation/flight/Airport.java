package day38_encapsulation.flight;

import day38_encapsulation.flight.FlightTicket;

public class Airport {

    public static void main(String[] args) {

        FlightTicket ticket1 = new FlightTicket("first", "Chicago", "Virginia");
        System.out.println(ticket1.getType());
        System.out.println(ticket1.getArrivalLocation());
        System.out.println(ticket1.getDepartureLocation());

        ticket1.setType("economy");
        System.out.println(ticket1.getType());
    }
}
