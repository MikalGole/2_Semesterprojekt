package model;

public class Seat {
	private int seatNo;
	private int seatRow;
	private boolean isSpecial;
	
	public Seat() {
		
	}
	
	// getter and setter for seatNo
	public int getSeatNo() {
		return seatNo;
	}
	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}

	// getter and setter for seatRow
	public int getSeatRow() {
		return seatRow;
	}
	public void setSeatRow(int seatRow) {
		this.seatRow = seatRow;
	}
	
	// getter and setter for isSpecial
	public boolean isSpecial() {
		return isSpecial;
	}
	public void setSpecial(boolean isSpecial) {
		this.isSpecial = isSpecial;
	}

}
