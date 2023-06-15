package stepdefs;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.And;
import io.cucumber.java.en.But;

public class StepDefinitions {
	@Given("I want to write a step with precondition")
	public void i_want_to_write_a_step_with_precondition() {
	    System.out.println("Method-001");
	}

	@Given("some other precondition")
	public void some_other_precondition() {
		System.out.println("Method-002");
	}

	@When("I complete action")
	public void i_complete_action() {
		System.out.println("Method-003");
	}

	@When("some other action")
	public void some_other_action() {
		System.out.println("Method-004");
	}

	@When("yet another action")
	public void yet_another_action() {
		System.out.println("Method-005");
	}

	@Then("I validate the outcomes")
	public void i_validate_the_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Method-006");
	}

	@Then("check more outcomes")
	public void check_more_outcomes() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Method-007");
	}

	@Given("I want to write a step with name1")
	public void i_want_to_write_a_step_with_name1() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Method-008");
	}

	@When("I check for the {int} in step")
	public void i_check_for_the_in_step(Integer int1) {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Method-009");
	}

	@Then("I verify the success in step")
	public void i_verify_the_success_in_step() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Method-010");
	}

	@Given("I want to write a step with name2")
	public void i_want_to_write_a_step_with_name2() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Method-011");
	}

	@Then("I verify the Fail in step")
	public void i_verify_the_fail_in_step() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("Method-012");
	}

}
