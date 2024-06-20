package org.employee;

public class EmployeeDetails { // block or body of the class

	private void empName() {
		// implementation or business logic
		// double quote : String -> predefinded class
		System.out.println("Employee name: Anand");
	}
	
	private void empId() {
		System.out.println("Employee id : 111");
	}
	
	private void empMobile() {
		System.out.println("Employee mobile: 7200983432");
	}
	
	public static void main(String[] args) {
		// object creation
		EmployeeDetails e = new EmployeeDetails();
		// method call
		e.empName();
//		e.empId();
//		e.empMobile();
		
		
	}
	
	
}
