package abstractandinterface;

public class InterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculus cal=new Calculus("Lalji Parsad","Integral Calculus","Lal ji",100);
		System.out.println(cal.publisherName());
		System.out.println(cal.authorName());
		System.out.println(cal.writeName());
		System.out.println(cal.bookName());
		System.out.println(cal.pageNo());
		System.out.println(cal.address());
	}

}
