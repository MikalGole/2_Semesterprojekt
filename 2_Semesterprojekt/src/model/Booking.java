package model;


public class Booking {
	private String bookingNo;
	private String bookingDate;
	
	public Booking(String bookingNo, String bookingDate) {
		this.bookingNo = bookingNo;
		this.bookingDate = bookingDate;
	}
	
	public String getBookingNo() {
		return bookingNo;
	}
	
	public String getBookingDate() {
		return bookingDate;
	}
}
