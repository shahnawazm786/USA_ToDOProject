package abstractandinterface;

public class Calculus implements IBook{

	String Wname;
	String bName;
	String aName;
	public Calculus(String writerName,String bookName,String authorName) {
		this.Wname=writerName;
		this.bName=bookName;
		this.aName=authorName;
	}
	@Override
	public String writeName() {
		// TODO Auto-generated method stub
		return this.Wname;
	}

	@Override
	public String bookName() {
		// TODO Auto-generated method stub
		return this.bName;
	}

	@Override
	public String authorName() {
		// TODO Auto-generated method stub
		return this.aName;
	}
	public String publisherName() {
		return publisherName;
	}

}
