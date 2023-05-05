package testng;

import org.testng.annotations.Test;

public class Depends_Group_TestNG_Example {
	
	@Test(groups = "Sanity")
	public void ComposeMail() {
		System.out.println("Compose mail");
	}
	@Test(groups = "Sanity")
	public void ReadMail() {
		System.out.println("Read mail");
	}
	@Test(groups = "Sanity")
	public void DeleteMail() {
		System.out.println("Delete mail");
	}
	@Test(dependsOnGroups = "Sanity")
	public void Login() {
		System.out.println("Login");
	}
	
	@Test(groups="Regression")
	public void FeedBacckMail(){
		System.out.println("Feedback mail");
	}
}
