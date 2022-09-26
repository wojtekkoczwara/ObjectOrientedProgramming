package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
//    public static void main(String[] args) {
//        Theater theater = new Theater("Olympian", 8, 12);
//        theater.getSeats();
//        if(theater.reserveSeat("H11")){
//            System.out.println("Please pay");
//        } else  {
//            System.out.println("sorry, seat is taken");
//        }
//        if(theater.reserveSeat("H11")){
//            System.out.println("Please pay");
//        } else  {
//            System.out.println("sorry, seat is taken");
//        }
    public static void main(String[] args) {
        TheaterBinary theaterBinary = new TheaterBinary("Olympian", 8, 12);
//        theaterBinary.getSeats();
//        if(theaterBinary.reserveSeat("H11")){
//            System.out.println("Please pay");
//        } else  {
//            System.out.println("sorry, seat is taken");
//        }
//        if(theaterBinary.reserveSeat("H11")){
//            System.out.println("Please pay");
//        } else  {
//            System.out.println("sorry, seat is taken");
//        }

//        shallow copy
//        List<TheaterBinary.Seat> seatCopy = new ArrayList<>(theaterBinary.seats);
//        printList(seatCopy);
//
//        seatCopy.get(1).reserve();
        if(theaterBinary.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theaterBinary.reserveSeat("D12")){
            System.out.println("Please pay for D12");
        } else {
            System.out.println("Seat already reserved");
        }

        if(theaterBinary.reserveSeat("B13")){
            System.out.println("Please pay for B13");
        } else {
            System.out.println("Seat already reserved");
        }

        List<TheaterBinary.Seat> reverseSeats = new ArrayList<>(theaterBinary.getSeats());
        Collections.reverse(reverseSeats);
        printList(reverseSeats);
        //references are for the same objects!!

        //sorting
//        Collections.reverse(seatCopy);
//        System.out.println("printing seatCooy");
//        printList(seatCopy);
//
//        System.out.println("printing thetre seats");
//        printList(theaterBinary.seats);
//
//        Collections.shuffle(seatCopy);
//        printList(seatCopy);
//
//        TheaterBinary.Seat minSeat = Collections.min(seatCopy);
//        TheaterBinary.Seat maxSeat = Collections.max(seatCopy);
//        System.out.println("Min seat number is " + minSeat.getSeatNumber());
//        System.out.println("Max seat number is " + maxSeat.getSeatNumber());
//
//        //swap
//        sortList(seatCopy);
//        System.out.println("Printing sorted seatCopy");
//        printList(seatCopy);

        List<TheaterBinary.Seat> priceSeats = new ArrayList<>(theaterBinary.getSeats());
        priceSeats.add(theaterBinary.new Seat("B00", 13.00));
        priceSeats.add(theaterBinary.new Seat("A00", 13.00));
        priceSeats.add(theaterBinary.new Seat("A00", 13.00));
        Collections.sort(priceSeats, TheaterBinary.PRICE_ORDER);

        System.out.println("$$$$$$$$$$$$$$$$$$$$$");
        printList(priceSeats);

    }

    public static void printList(List<TheaterBinary.Seat> list){
        for(TheaterBinary.Seat seat : list){
            System.out.print(" " + seat.getSeatNumber() + " " + seat.getPrice());
        }
        System.out.println();
        System.out.println("=====================================");
    }

//    public static void sortList(List<? extends TheaterBinary.Seat> list){
//        for (int i = 0; i < list.size() -1 ; i++) {
//            for (int j = 0; j < list.size(); j++) {
//                if(list.get(i).compareTo(list.get(j)) > 0){
//                    Collections.swap(list, i, j);
//                }
//            }
//        }
//    }
}
