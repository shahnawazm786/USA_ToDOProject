package abstractandinterface;

public interface IBook extends IAddress {
	final String publisherName="NCERT"; // final
	String writeName(); // abstract static and public
	String bookName(); 
	String authorName();

}
