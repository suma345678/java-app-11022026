package com.codegnan.Day17.module1;

public class Employee {
	private int employeeId;
	private String firstName;
	private String lastName;
	private String dateOfJoining;
	private String emailAddress;
	private String mobileNumber;
	
	public Employee() {
	}
	
	public Employee(int employeeId, String firstName, String lastName, String dateOfJoining, String emailAddress, String mobileNumber) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfJoining = dateOfJoining;
		this.emailAddress = emailAddress;
		this.mobileNumber = mobileNumber;
	}
	
	public Employee(int employeeId, String firstName, String lastName) {
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
}