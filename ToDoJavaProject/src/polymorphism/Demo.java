package polymorphism;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AuthorClass ac=new AuthorClass();
		ac.showAuthor();
		
		JavaBook jb=new JavaBook();
		jb.showAuthor();
		
		AuthorClass ac1=new OracleClass(); // compiler 
		ac1.showAuthor();
		AuthorClass ac2=new JavaBook(); // 
		ac2.showAuthor();
		
		
		
	}

}
