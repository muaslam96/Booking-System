package com.bookingsystem;

public class SeatManager {
	
	private int[] seats;
	private int totalSeats;
	
    
	public SeatManager() {
		
		this.totalSeats = 15;
		this.seats = new int[totalSeats];
		
	}
	
	public int checkSeatAvailability() {
		
		boolean seatsAvailable = false;
		int seatNumber = 0;
		
		for(int i=14; i<seats.length; i--) {
			if(seats[i] == 0) {
				seatNumber = i+1;
				seatsAvailable = true;
				break;
			}	
		}
		
		if(seatsAvailable) {
			System.out.println("Seats are available for booking.");
		}
		else {
			System.out.println("No seat is available. SORRY");
		}
		System.out.println("Available Seat Number : "+seatNumber);
		return seatNumber;
	}
	
}
