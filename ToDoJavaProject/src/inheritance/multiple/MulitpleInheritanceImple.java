package inheritance.multiple;

public class MulitpleInheritanceImple extends BookImplement implements IBook,IAuthor{
String publicserName;
public void setPublisherName(String pubName) {
	this.publicserName=pubName;
}
public void showPublisherName() {
	System.out.println("Publisher name \t"+this.publicserName);
}
}
