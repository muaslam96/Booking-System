package com.bookingsystem;

public class SeatManager {
	
	private int[] seats;
	private int totalSeats;
	
    
	public SeatManager() {
		
		this.totalSeats = 15;
		this.seats = new int[totalSeats];
		
	}
	
	public void checkSeatAvailability() {
		
		boolean seatsAvailable = false;
		
		for(int i=0; i<seats.length; i++) {
			
			if(seats[i] == 0) {
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
	}
	
}
