package inheritance.multiple;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MulitpleInheritanceImple m=new MulitpleInheritanceImple();
		m.addAuthor("Lalji Parsad");
		m.addBook(200, "Calculus");
		m.setPublisherName("NCERT");
		m.showBook();
		m.authorDetails();
		m.showPublisherName();
	}

}
