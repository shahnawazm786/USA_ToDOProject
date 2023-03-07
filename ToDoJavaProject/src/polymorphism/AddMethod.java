package polymorphism;

public class AddMethod  implements IAdd{

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Addition of ->"+a +"and ->"+b+"\t="+(a+b));
		
	}

	@Override
	public void add(int a, int b, int c) {
		// TODO Auto-generated method stub
		System.out.println("Addition of ->"+a +" and ->"+b+" and "+c+" \t="+(a+b+c));
	}
	 void add(int a, float b) {
		// TODO Auto-generated method stub
		System.out.println("Addition of ->"+a +"and ->"+b+"\t="+(a+b));
		
	}


}
