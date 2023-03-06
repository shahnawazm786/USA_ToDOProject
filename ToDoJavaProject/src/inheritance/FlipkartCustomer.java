package inheritance;

public class FlipkartCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerAddress ca=new CustomerAddress();
		ca.Name="Flipkart Customer";
		ca.Email="flipkart@customer.com";
		ca.Phone="123456789";
		ca.pin="110065";
		ca.streetNo=22;
		ca.buildingName="GIP Mall";
		ca.showDetails();
		ca.getAddress1();
		ca.showCustomerAddress();
	}

}
