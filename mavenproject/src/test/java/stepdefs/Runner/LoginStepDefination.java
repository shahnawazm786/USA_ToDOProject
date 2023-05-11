package com.example.stepdefs;

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


@When("user enter user id {string}")
public void user_enter_user_id(String user) {
	System.out.println("user name \t"+user);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("user enter password {string}")
public void user_enter_password(String string) {
	System.out.println("password is \t"+string);
	// Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("user click on Signin button")
public void user_click_on_signin_button() {
	System.out.println("Click on sing in button");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@When("user click on sing in button")
public void user_click_on_sing_in_button() {
	System.out.println("Click on sing in button");
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}


@When("user select {double} shoe")
public void user_select_shoe(Double double1) {
	System.out.println("No of shoes"+double1);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}

@Then("user see {double} shoe in the cart")
public void user_see_shoe_in_the_cart(Double double1) {
	System.out.println("Rate is "+double1);
    // Write code here that turns the phrase above into concrete actions
    //throw new io.cucumber.java.PendingException();
}



}
