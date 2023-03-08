package keywords;

public class ChainingCosntructor {
	
	public ChainingCosntructor() {
		System.out.println("Constructor without parameter");
	}
	public ChainingCosntructor(String nm) {
		this();
		System.out.println("Constructor with one parameter"+nm);
		//
		
	}
	public ChainingCosntructor(String n,int age) {
		this(n);
		System.out.println("Constructor with two parameter"+n +" age is"+age);
		//
		
	}
	

}
