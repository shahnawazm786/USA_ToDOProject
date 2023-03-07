package polymorphism;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcualteClass cc=new CalcualteClass();
		cc.add(30000, 6000000);
		AddMethod a=new CalcualteClass();
		a.add(23000, 7000000);
		a=new DivisionClass();
		
	}

}
