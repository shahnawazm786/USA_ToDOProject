package inheritance;

public class Address {
	 String Email;
	 String Phone;
	 String Name;
	/*public Address(String name,String phone,String email) {
		this.Email=email;
		this.Name=name;
		this.Phone=phone;
	}*/
	
	public void showDetails() {
		System.out.println("Name -> \t"+this.Name);
		System.out.println("Phone -> \t"+this.Phone);
		System.out.println("Email -> \t"+this.Email);
	}
}
