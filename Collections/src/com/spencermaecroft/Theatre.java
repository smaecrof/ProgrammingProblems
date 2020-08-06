package com.spencermaecroft;

import java.util.*;

/**
 * Created by SMC on 08/05/2020
 */
public class Theatre {
    private final String theatreName;
    public List<Seat> seats = new ArrayList<>();

    public Theatre(String theatreName, int numberOfRows, int seatsPerRow){
        this.theatreName = theatreName;

        int lastRow = 'A' + (numberOfRows -1);
        for(char row = 'A'; row <= lastRow; row++){
            for(int seatNum = 1; seatNum <= seatsPerRow; seatNum++){
                Seat seat = new Seat(row + String.format("%02d", seatNum));
                seats.add(seat);
            }
        }
    }

    public String getTheatreName(){
        return this.theatreName;
    }

    public boolean reserveSeat2(String seatNumber){
        int low = 0;
        int high = seats.size() -1 ;

        while(low <= high){
            System.out.print(".");
            int mid = (low + high) / 2;
            Seat midVal = seats.get(mid);
            int cmp = midVal.getSeatNumber().compareTo(seatNumber);

            if(cmp < 0){
                low = mid + 1;
            } else if (cmp > 0){
                high = mid -1;
            } else {
                return seats.get(mid).reserve();
            }
        }
        System.out.println("There is no seat " + seatNumber);
        return false;
    }

    public boolean reserveSeat(String seatNumber){
        Seat requestedSeat = new Seat(seatNumber);
        int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
        if(foundSeat >= 0){
            return seats.get(foundSeat).reserve();
        } else {
            System.out.println("There is no seat " + seatNumber);
        }

//        NOT VERY EFFICIENT, BINARY SEARCH WAS A BETTER OPTION ON THIS LIST
//        for(Seat seat: seats){
//            System.out.print(".");
//            if(seat.getSeatNumber().equals(seatNumber)){
//                requestedSeat = seat;
//                break;
//            }
//        }
//        if(requestedSeat == null){
//            System.out.println("There is not seat " + seatNumber);
//            return false;
//        }

        return requestedSeat.reserve();
    }

    // For testing purposes
    public void getSeats(){
        for(Seat seat: seats){
            System.out.println(seat.getSeatNumber());
        }
    }

    public class Seat implements Comparable<Seat>{
        private final String seatNumber;
        private boolean reserved = false;

        public Seat(String seatNumber){
            this.seatNumber = seatNumber;
        }

        public String getSeatNumber(){
            return this.seatNumber;
        }

        public boolean reserve(){
            if(!reserved){
                reserved = true;
                System.out.println("Seat " + seatNumber + " successfully Reserved");
                return true;
            } else {
                return false;
            }
        }

        public boolean cancel(){
            if(this.reserved){
                this.reserved = false;
                System.out.println("Seat " + seatNumber + " was successfully cancelled");
                return true;
            } else {
                return false;
            }
        }

        // compareTo() Method is built into the String class
        @Override
        public int compareTo(Seat seat){
            return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
        }
    }
}
