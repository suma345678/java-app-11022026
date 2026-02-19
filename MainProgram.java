package com.codegnan.Day17.program;

import com.codegnan.Day17.module1.Employee;

public class MainProgram {
	public static void main(String[] args) {
		//Employee employee = new Employee(101, "Shashi", "suma", "31/1/2026", "shashisuma493@gmail.com", "9985568971");
		
		/*Employee employee = new Employee();
		employee.setEmployeeId(101);
		employee.setFirstName("Shashi");
		employee.setLastName("suma");
		employee.setDateOfJoining("31/1/2026");
		employee.setEmailAddress(shashisuma493@gmail.com");
		employee.setMobileNumber("9985568971");*/
		
		/*Employee employee1 = new Employee(101, "Shashi", "suma", "31/1/2026", "shashisuma493@gmail.com", "9985568971");
		Employee employee2 = new Employee(102, "pooja", "Sharma");
		Employee employee3 = new Employee("pragati", "reddy");
		Employee employee4 = new Employee();*/
		
		/*Employee employee = new Employee();
		employee.setEmployeeId(101);
		employee.setFirstName("Shashi");
		employee.setLastName("suma");
		employee.setDateOfJoining("31/1/2026");
		employee.setEmailAddress("shashisuma493@gmail.com");
		employee.setMobileNumber("9985568971");*/
		
		Employee employee = new Employee(101, "Shashi", "suma", "31/1/2026", "shashisuma493@gmail.com", 9985568971");
		
		int empId = employee.getEmployeeId();
		System.out.println("Employee ID: " + empId);
		String fName = employee.getFirstName();
		System.out.println("First Name: " + fName);
		String lName = employee.getLastName();
		System.out.println("Last Name: " + lName);
		String dateOfJoining = employee.getDateOfJoining();
		System.out.println("Date of Joining: " + dateOfJoining);
		String emailId = employee.getEmailAddress();
		System.out.println("Email Address: " + emailId);
		String mobileNum = employee.getMobileNumber();
		System.out.println("Mobile Number: " + mobileNum);
	}
}
