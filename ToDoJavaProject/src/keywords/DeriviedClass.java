package keywords;

public class DeriviedClass extends ParentClass{
	
public DeriviedClass() {
	super();
	System.out.println("Derived class constructor without parameter");
}
public DeriviedClass(String name) {
	super(name);
	System.out.println("Derived class constructor with one parameter"+name);
}
public DeriviedClass(String name,String address) {
	super(name,address);
	System.out.println("Derived class constructor with two parameter"+name+" and address "+address);
}
}
