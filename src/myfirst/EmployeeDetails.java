package myfirst;

public class EmployeeDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEmpId(1);
		e1.firstName = ("Pooja");
		e1.lastName = ("Raol");
		e1.departmentName = ("IT");
		e1.salary = (55000);
		e1.phoneNumber = (519364501);		
		e1.printEmployeeDetails();
		
		Employee e2 = new Employee();
		e2.setEmpId(1);
		e2.firstName = ("Rajveersinh");
		e2.lastName = ("Raol");
		e2.departmentName = ("EC");
		e2.salary = (65000);
		e2.phoneNumber = (519367801);		
		e2.printEmployeeDetails();
		
		Employee e3 = new Employee();
		e3.setEmpId(1);
		e3.firstName = ("Kinshu");
		e3.lastName = ("Patel");
		e3.departmentName = ("MC");
		e3.salary = (62000);
		e3.phoneNumber = (879367801);		
		e3.printEmployeeDetails();
		
	}

}
