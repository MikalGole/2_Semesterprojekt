package model;

import java.util.ArrayList;

public class Hall {
	private String hallNo;
	private int totalSeats;
	private ArrayList<Seat> seat;
	
	public Hall(String hallNo, int totalSeats) {
		this.hallNo = hallNo;
		this.totalSeats = totalSeats;
	}
	
	public void addSeat(Seat seat) {
		
	}
	
	
	// getters and setters for hallNo
	public String getHallNo() {
		return hallNo;
	}
	public void setHallNo(String hallNo) {
		this.hallNo = hallNo;
	}
	
	//getters and setters for totalSeats
	public int getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(int totalSeats) {
		this.totalSeats = totalSeats;
	}
}
