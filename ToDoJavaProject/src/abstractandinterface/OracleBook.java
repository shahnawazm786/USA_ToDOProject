package abstractandinterface;

public class OracleBook extends ABook {

	@Override
	String writeName() {
		// TODO Auto-generated method stub
		return "Abc";
	}

	@Override
	String bookName() {
		// TODO Auto-generated method stub
		return "Oracle Database";
	}
	
	public int price() {
		return 500;
	}

	@Override
	public String address() {
		// TODO Auto-generated method stub
		return "USA";
	}

	@Override
	public int pageNo() {
		// TODO Auto-generated method stub
		return 0;
	}

}
