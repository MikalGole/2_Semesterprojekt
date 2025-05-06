package model;
/**
 * Author: Mikal
 */
public class Customer {
	private String name;
	private String email;
	private String phoneNo;
	private String workerID;
	private String address;
	
	public Customer(String name, String email, String phoneNo, String workerID, String address) {
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
		this.workerID = workerID;
		this.address = address;
	}
	
	// getter and setter for name
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	// getter and setter for email
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	// getter and setter for phoneNo
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	// getter and setter for workerID
	public String getWorkerID() {
		return workerID;
	}
	public void setWorkerID(String workerID) {
		this.workerID = workerID;
	}

	// getter and setter for address
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
