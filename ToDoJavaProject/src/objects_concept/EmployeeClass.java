package objects_concept;

public class EmployeeClass {
	private int emp_no;
	private String emp_name;
	private String phone;
	private String email;
	private String address;
	private char gender;
	//String dob;
	//String doj;
	//String dor;
	//int salary;// class variable 
	/*public EmployeeClass(int empno,String ename,String phone,String email,String address,char gender) {
		this.emp_no=empno;
		this.emp_name=ename;
		this.phone=phone;
		this.email=email;
		this.address=address;
		this.gender=gender;
	}*/
	public EmployeeClass() {
	
		this.emp_no=100;
		this.emp_name="India";
		this.phone="1234567";
		this.email="india@gmail.com";
		this.address="India";
		this.gender='F';
	}
	
	public void add(int empno,String ename,String phone,String email,String address,char gender) {
		//double commission; // local variable to the add method
		this.emp_no=empno;
		this.emp_name=ename;
		this.phone=phone;
		this.email=email;
		this.address=address;
		this.gender=gender;
		
	}
	public void modify() {
		
	}
	public void delete() {
		
	}
	public void search() {
		
	}
	public void show() {
		System.out.println("Employee no  =>"+this.emp_no);
		System.out.println("Employee name  =>"+this.emp_name);
		System.out.println("Employee Phone  =>"+this.phone);
		System.out.println("Employee email  =>"+this.email);
		System.out.println("Employee address  =>"+this.address);
		System.out.println("Employee gender  =>"+this.gender);
	}

}
