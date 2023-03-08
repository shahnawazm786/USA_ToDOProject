package keywords;

public class ChainingCosntructor {
	String name;
	public ChainingCosntructor() {
		System.out.println(this.name);
	}
	public ChainingCosntructor(String nm) {
		super();
		this.name=nm;
		System.out.println(this.name);
	}

}
