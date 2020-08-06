package com.spencermaecroft;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    Theatre theatre = new Theatre("Olympian", 8,12);

	    if(theatre.reserveSeat("D12")){
	        System.out.println("Please pay for D12");
        } else {
	        System.out.println("Seat already reserved");
        }

        if(theatre.reserveSeat("A02")){
            System.out.println("Please pay for A02");
        } else {
            System.out.println("Seat already reserved");
        }

//        if(theatre.reserveSeat("D12")){
//            System.out.println("Please pay for D12");
//        } else {
//            System.out.println("Seat already reserved");
//        }

        System.out.println("Printing theatre.seats");
        List<Theatre.Seat> theatreSeats = new ArrayList<>(theatre.getSeats());
        printList(theatreSeats);

        List<Theatre.Seat> reverseSeats = new ArrayList<>(theatre.getSeats());
        Collections.reverse(reverseSeats);
        System.out.println("Printing reverseSeats");
        printList(reverseSeats);

        List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats());
        priceSeats.add(theatre.new Seat("B00", 13));
        priceSeats.add(theatre.new Seat("A00", 13.00));
        Collections.sort(priceSeats, Theatre.PRICE_ORDER);
        System.out.println("Printing priceSeats");
        printList(priceSeats);

    }

    public static void printList(List<Theatre.Seat> list){
        for (Theatre.Seat seat:list){
            System.out.print(" " + seat.getSeatNumber() + " $" + seat.getPrice());
        }
        System.out.println();
        System.out.println("==========================================");
    }
}
