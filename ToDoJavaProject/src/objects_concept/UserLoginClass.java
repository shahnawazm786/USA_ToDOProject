package objects_concept;

public class UserLoginClass {
	String userName;
	String password;
	String verifyLoginUser(String userName,String Password) {
		if(userName.equalsIgnoreCase("Admin") & Password.equalsIgnoreCase("Admin123")) {
			return "User Name and Password Verified";
		}
		else {
			return "User and Password not correct";
		}
	}
	boolean verifyUser(String userName) {
		
		return true;
	}
	boolean verifyPassword(String password) {
		return false;
	}
}
