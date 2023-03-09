package keywords.statics;

public class DerivedClass extends ParentClass{
	
public DerivedClass() {
	super();
	System.out.println("Default Constructor in Derived Class");
}
public DerivedClass(String para) {
	super(para);
	System.out.println(" Constructor with one parameter in Derived Class"+para);
}
}
