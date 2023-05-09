package stepdefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefination {

@Given("user visit to login page")
public void user_visit_to_login_page() {
	System.out.println("login_oage");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("user enter user id")
public void user_enter_user_id() {
	System.out.println("Enter user id");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@And("user enter passowrd")
public void user_enter_passowrd() {
	System.out.println("Enter user password");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@And("user click on Sing button")
public void user_click_on_sing_button() {
	System.out.println("Click sign in button");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("user redirect to dashboard")
public void user_redirect_to_dashboard() {
	System.out.println("Re-direct to dashboard");
	// Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@And("user can see logout link")
public void user_can_see_logout_link() {
	System.out.println("Can see logout button");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

}
