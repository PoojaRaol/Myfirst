package myfirst;

public class Employee {
	static int noOfEmployee = 25;
	public String departmentName;
	private int empId;
	public String firstName;
	public String lastName;
	public int phoneNumber;
	public int salary;
	
	void printEmployeeDetails() {
		System.out.println("Employee_Id = " + empId + ", " + "Name = " + firstName + " " + lastName +  ", " +  "Department = " + departmentName + ", " +  "Annual Salary = " + salary +  ", " + "Contact details = " + phoneNumber);
		
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}

}
