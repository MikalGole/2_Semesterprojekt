package model;

public class Order {
	private String orderNo;
	private String orderDate;
	private double totalPrice;
	
	public Order(String orderNo, String orderDate, double totalPrice) {
		this.orderNo = orderNo;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
	}
	
	// getters and getters for orderNo
	public String getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	// getters and getters for orderDate
	public String getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}
	
	// getters and getters for totalPrice
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
}
