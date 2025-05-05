package model;
/**
 * Author: Mikal
 */
public class Hall {
	private String hallNo;
	private int totalSeats;
	
	public Hall(String hallNo, int totalSeats) {
		this.hallNo = hallNo;
		this.totalSeats = totalSeats;
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
