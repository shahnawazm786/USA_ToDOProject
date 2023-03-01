package abstractandinterface;

public class AbstractClassImplDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABook book=new OracleBook();
		System.out.println(book.bookName());
		System.out.println(book.writeName());
		OracleBook oracle=new OracleBook();
		System.out.println(oracle.bookName());
		System.out.println(oracle.writeName());
		System.out.println(oracle.price());
		CBook book2=new CBook();
		System.out.println(book2.bookName());
		System.out.println(book2.writeName());
		System.out.println(book2.typeOfBook());
		
		
		
		
	}

}
