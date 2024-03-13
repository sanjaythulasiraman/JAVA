package org.emp;

public class Employee {
	
	private void empId() {
		System.out.println("empId - 734369");
	}
	
	private void empName() {
		System.out.println("empName - saravanan");
	}
	
	private void empDob() {
		System.out.println("empDob - 12.09.1999");
	}
	
	private void empPhone() {
		System.out.println("empPhone - 8284757191");
	}

	private void empEmail() {
		System.out.println("empEmail - saravanan12@gmail.com");
	}
	
	private void empAddress() {
		System.out.println("empAddress - no.36, tvs colony, anna nagar west extn, chennai-101");
	}
	public static void main(String[] args) {
		Employee com = new Employee();
		com.empId();
		com.empName();
		com.empDob();
		com.empPhone();
		com.empEmail();
		com.empAddress();
	}
}
