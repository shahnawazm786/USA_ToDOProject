package inheritance;

public class InheritenceImplement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("------------------- Customer Details ---------------");
		CustomerClass cs=new CustomerClass("John", "123456", "john@gmail.com", "USA");
		cs.showCustomerDetails();
		System.out.println("------------------- Vendor Details ---------------");
		VendorClass vs=new VendorClass("Flipkart", "7777777", "sales@flipkart.com", "New Delhi");
		vs.showVendorDetails();
	}

}
