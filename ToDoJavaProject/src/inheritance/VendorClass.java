package inheritance;

public class VendorClass extends Address{
	private String StoreLocation;
	public VendorClass(String name, String phone, String email,String location) {
		super(name, phone, email);
		// TODO Auto-generated constructor stub
		this.StoreLocation=location;
	}
	public void showVendorDetails() {
		showDetails();
		System.out.println("Vendor Location ->\t"+this.StoreLocation);
	}

}
