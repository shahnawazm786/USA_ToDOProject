package objects_concept;

public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EmployeeClass emp; // reference EmployeeClass
		//System.out.println(emp.emp_no);
		//emp=new EmployeeClass(); // Object
		//EmployeeClass emp1=new EmployeeClass();// default constructor
	/*	System.out.println(emp.emp_no);  String variable => null and Number variable => 0 Date => default 1/1/1900
		System.out.println(emp.emp_name);
		System.out.println(emp.address);
		System.out.println(emp.phone);
		System.out.println(emp.email);
		System.out.println(emp.gender);
		*/
		//emp.add(100, "John", "209890", "john@gmail.com","USA", 'M');
		//emp.show();
		
		EmployeeClass e=new EmployeeClass();
		e.show();
		BankCustomerClass bank=new BankCustomerClass();
		
		
	}
}
