package abstractandinterface;

public class Calculus implements IBook,IBookPages{

	private String Wname;
	private String bName;
	private String aName;
	private int pageNo;
	public Calculus(String writerName,String bookName,String authorName,int page) {
		this.Wname=writerName;
		this.bName=bookName;
		this.aName=authorName;
		this.pageNo=page;
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
	@Override public int pageNo() {
		return this.pageNo;
	}

}
