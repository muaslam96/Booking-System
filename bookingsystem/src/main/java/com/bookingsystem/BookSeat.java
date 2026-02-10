package com.bookingsystem;

import java.util.HashMap;

public class BookSeat {
    private String userId;

    // Constructor
    public BookSeat(String userId) {
        this.userId = userId;
    }

    // Optional: getter
    public String getUserId() {
        return userId;
    }

    // Optional: other methods
    public void showBooking() {
        System.out.println("Booking for user: " + userId);
    }
    
    public void bookSeatsforUser(String userId, String seatNumber) {
    	
    	 HashMap<String, String> seatBookings = new HashMap<>();
    	 
    	 if (!seatBookings.containsKey(userId)) {
    		    seatBookings.put(userId, seatNumber);
    		    System.out.println("Seat Number "+seatNumber+" has been booked.");
    		} else {
    		    System.out.println("User already has a seat booked!");
    		}
    	 
    	
    }
    
    
    
}
