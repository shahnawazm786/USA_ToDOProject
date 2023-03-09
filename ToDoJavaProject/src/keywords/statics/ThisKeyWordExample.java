package keywords.statics;

public class ThisKeyWordExample {

	public ThisKeyWordExample() {
		System.out.println("this is default constructor");
	}
	public ThisKeyWordExample(String para1) {
		this();
		System.out.println("This is constructor with one para"+para1);
	}
	public ThisKeyWordExample(String para1,int no) {
		this(para1);
		System.out.println("This is constructor with two para "+para1 +" second "+no);
	}
	
}
