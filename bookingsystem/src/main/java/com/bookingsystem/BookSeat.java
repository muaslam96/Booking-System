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
    
    public String bookSeatsforUser(String userId) {
    	
    	 HashMap<String, String> seatBookings = new HashMap<>();
    	 
    	 //seatBookings.put(userId, "")
    	
    	return userId;
    }
    
}
