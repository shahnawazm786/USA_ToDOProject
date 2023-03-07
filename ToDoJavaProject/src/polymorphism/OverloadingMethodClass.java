package polymorphism;

public class OverloadingMethodClass {
	
	public void add(int a,int b) {
		System.out.println("Two parameter of add(int,int)");
		System.out.println("Addition -> of"+a+"\t and "+b +"\t ="+(a+b));
	}
	public void add() {
		System.out.println("No parameter of add()");
	}
	public void add(long a,int b) {
		System.out.println("Two parameter of add(long,int)");
		System.out.println("Addition -> of"+a+"\t and "+b +"\t ="+(a+b));
	}
	public void add(int a,long b) {
		System.out.println("Two parameter of add(int,long)");
		System.out.println("Addition -> of"+a+"\t and "+b +"\t ="+(a+b));
	}
	public void add(long a,long b) {
		System.out.println("Two parameter of add(long,long)");
		System.out.println("Addition -> of"+a+"\t and "+b +"\t ="+(a+b));
	}
	public void add(double a,int b) {
		System.out.println("Two parameter of add(double,int)");
		System.out.println("Addition -> of"+a+"\t and "+b +"\t ="+(a+b));
	}
	public void add(int a,int b,int c) {
		System.out.println("Two parameter of add(int,int,int)");
		System.out.println("Addition -> of"+a+"\t and "+b +"\t and c"+"\t =\t"+(a+b+c));
	}

}
