package inheritance.multiple;

public class BookImplement implements IBook ,IAuthor{
 int pageNo;
 String bookName;
 String authorName;
@Override
public void addBook(int pageno,String bookname) {
	// TODO Auto-generated method stub
	this.pageNo=pageno;
	this.bookName=bookname;
	
}
@Override
public void showBook() {
	// TODO Auto-generated method stub
	System.out.println("Book name -> \t"+this.bookName+"\n Page no ->"+this.pageNo);
}
@Override
public void authorDetails() {
	// TODO Auto-generated method stub
	System.out.println("Author name -> \t"+this.authorName);
}
@Override
public void addAuthor(String authorName) {
	// TODO Auto-generated method stub
	this.authorName=authorName;
}
 
}
