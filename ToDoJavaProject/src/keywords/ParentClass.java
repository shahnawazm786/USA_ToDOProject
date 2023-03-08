package keywords;

public class ParentClass {
	public ParentClass() {
		System.out.println("Parent Class constructor without parameter");
	}
	public ParentClass(String name) {
		System.out.println("Parent Class constructor with one parameter"+name);
	}
	public ParentClass(String name,String address) {
		System.out.println("Parent Class constructor with two parameter"+name +" and address"+address);
	}
}
