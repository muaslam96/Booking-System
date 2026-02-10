package com.bookingsystem;

import java.util.HashMap;

public class BookSeat {
    
    private String userId;
    HashMap<String, String> seatBookings = new HashMap<>();

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
    	
        System.out.println("The seat number being passed for booking seats is : "+ seatNumber);
    	 
    	 if (!seatBookings.containsKey(userId)) {
    		    seatBookings.put(userId, seatNumber);
    		    System.out.println("Seat Number "+seatNumber+" has been booked.");
    		} else {
    		    System.out.println("User already has a seat booked!");
    		}
    	 
    	
    }

    public void cancelUserBooking(String userId){
        
        if (seatBookings.containsKey(userId)) {
    		    seatBookings.remove(userId);
    		    System.out.println("Your booking has been canceled");
    		} else {
    		    System.out.println("You have no previous booking available");
    		}
    }
    
    
    
}
