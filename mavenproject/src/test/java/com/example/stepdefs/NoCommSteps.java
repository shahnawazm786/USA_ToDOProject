package com.example.stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HeaderPage;
import pages.HomePage;

public class NoCommSteps{
	
	HomePage homePage=new HomePage(Hooks.driver);
	HeaderPage headerPage=new HeaderPage(Hooks.driver);
	@Given("Validate home page title")
	public void open_the_application() {
	   homePage.validateTitle("Free and open-source eCommerce platform. ASP.NET Core based shopping cart. - nopCommerce");
	}

	@When("clik on get started")
	public void clik_on_get_started() {
	   homePage.navigateGetStart();
	}

	@Then("verify the title of the page")
	public void verify_the_title_of_the_page() {
	    homePage.validateGetStartPageTitle("Get started with nopCommerce - nopCommerce12345");
	}
	
	
	
	
/*
 *  Product page steps
 */
	@When("clik on product menu")
	public void clik_on_product_menu() {
    
}

	@Then("verify the title of the product page")
	public void verify_the_title_of_the_product_page() {
    
	}


}
