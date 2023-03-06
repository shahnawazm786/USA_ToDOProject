package inheritance;

public class Address1 extends Address {
	int streetNo;
	String buildingName;
	public void getAddress1() {
		System.out.println("Street No -> \t "+this.streetNo);
		System.out.println("Building Name \t->"+this.buildingName);
		//return "Street No -> \t "+this.streetNo+"\t Building Name \t->"+this.buildingName;
	}

}
