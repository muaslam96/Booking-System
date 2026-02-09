package com.bookingsystem;

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
}
