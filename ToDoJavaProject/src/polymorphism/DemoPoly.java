package polymorphism;

public class DemoPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingMethodClass o=new OverloadingMethodClass();
		o.add();
		o.add(10, 10);
		o.add(100, 5000, 60);
		o.add(6000000, 6000000);
	}

}
