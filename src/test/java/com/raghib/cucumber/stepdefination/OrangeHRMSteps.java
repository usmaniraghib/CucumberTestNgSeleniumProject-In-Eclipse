package com.raghib.cucumber.stepdefination;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OrangeHRMSteps {
	
	@Given("I launch chrome browser")
	public void i_launch_chrome_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I launch chrome browser");
	}

	@When("I open orange hrm home page")
	public void i_open_orange_hrm_home_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I open orange hrm home page");
	}

	@Then("I verify that the logo present on page")
	public void i_verify_that_the_logo_present_on_page() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("I verify that the logo present on page");
	}

	@Then("close browser")
	public void close_browser() {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("close browser");
	}
}
