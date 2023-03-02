package inheritance;

public class CustomerClass extends Address{

	private String Location;
	public CustomerClass(String name, String phone, String email,String location) {
		super(name, phone, email);
		// TODO Auto-generated constructor stub
		this.Location=location;
	}

	public void showCustomerDetails() {
		showDetails();
		System.out.println("Location ->\t"+this.Location);
	}

}
