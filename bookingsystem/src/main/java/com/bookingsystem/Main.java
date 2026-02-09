package com.bookingsystem;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world from the main class!");

        BookSeat booking = new BookSeat("123");
        booking.showBooking();
    }
}