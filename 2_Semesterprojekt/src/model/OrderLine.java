package model;

public class OrderLine {
	private int quantity;
	private double unitPrice;
	private String productName;
	
	public OrderLine(int quantity, double unitPrice, String productName) {
		this.quantity = quantity;
		this.unitPrice = unitPrice;
		this.productName = productName;
	}

	// getters and setters for quantity
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	// getters and setters for unitPrice
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	// getters and setters for productName
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}


}
