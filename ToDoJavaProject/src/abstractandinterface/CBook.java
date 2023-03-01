package abstractandinterface;

public class CBook extends ABook{

	@Override
	String writeName() {
		// TODO Auto-generated method stub
		return "Kanitkar";
	}

	@Override
	String bookName() {
		// TODO Auto-generated method stub
		return "Basic C";
	}
	
	public String typeOfBook() {
		return "Computer Book";
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return "India";
	}

	@Override
	public int pageNo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
