package objects_concept;

public class OrangeHRMSApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserLoginClass user=new UserLoginClass(); // Object create when you are using the classes
		String res=user.verifyLoginUser("Admin", "Abc");
		if(res.equalsIgnoreCase("User Name and Password Verified")) {
			System.out.print("Go to Dashboard");
		}
		else {
			System.out.println("User and Password is not correct");
			
		}
	}

}
