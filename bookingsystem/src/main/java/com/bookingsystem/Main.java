package com.bookingsystem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        //So the basic concept of this is to implement a booking system using hashmaps and arrays.
        //At first the user will enter his userID.
        //Then he will check if the seats are available.
        //If there are not seats available then a message will be prompted. Otherwise he will be shown a list of available 
        //seats. Then he can chose from that list which seat number he wants and that seat will be booked against his ID.
        //Furthermore, if the user does not have any preference for a seat number then the last available seat will be 
        //assigned to his ID. The user can also cancel his booking anytime he wants.
        
    	Scanner scanner = new Scanner(System.in);
    	
        String seatNumber;
        
        System.out.println("Welcome. Please enter your user ID : ");
        String userId = scanner.nextLine();
        
        //System.out.println("Welcome. Please enter your desired seat number : ");
        //String userSeat = scanner.nextLine();
        
        //Check for seat availability
        SeatManager seatManager = new SeatManager();
        seatNumber = Integer.toBinaryString(seatManager.checkSeatAvailability());
        
        BookSeat booking = new BookSeat(userId);
        booking.bookSeatsforUser(userId, seatNumber);
    }
}