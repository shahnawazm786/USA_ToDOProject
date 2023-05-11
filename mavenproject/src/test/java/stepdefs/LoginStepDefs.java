package stepdefs;

import static org.testng.Assert.assertFalse;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefs {

	@Given("user visit to login page")
	public void user_visit_to_login_page() {
		assertFalse(true);
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@When("user select {double} shoe")
	public void user_select_shoe(Double double1) {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("user see {double} shoe in the cart")
	public void user_see_shoe_in_the_cart(Double double1) {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@When("user enter user id")
	public void user_enter_user_id() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@When("user enter passowrd")
	public void user_enter_passowrd() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@When("user click on Sing button")
	public void user_click_on_sing_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("user redirect to dashboard")
	public void user_redirect_to_dashboard() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@Then("user can see logout link")
	public void user_can_see_logout_link() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

	@When("user enter user id {string}")
	public void user_enter_user_id(String string) {
		// Write code here that turns the phrase above into concrete actions
		// throw new io.cucumber.java.PendingException();
	}
	@When("user enter password {string}")
	public void user_enter_password(String string) {
		assertFalse(true);
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@When("user click on Signin button")
	public void user_click_on_signin_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}
	@When("user click on sing in button")
	public void user_click_on_sing_in_button() {
		// Write code here that turns the phrase above into concrete actions
		//throw new io.cucumber.java.PendingException();
	}

}
