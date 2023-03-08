package polymorphism;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book b=new Book();
		b.show();
		
		ChildBook cb=new ChildBook();
		cb.show();
		
		Book b1=new ChildBook();
		b1.show();
	}

}
