package com.Here.StepDefinition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
public class DocumentationFeatureTest {

	@Given("^User should be able to launch the browser$")
	public void user_should_be_able_to_launch_the_browser()  {
	    // Write code here that turns the phrase above into concrete actions
	   System.out.println("Please come ");
	}

	@When("^User should be able to navigate to the required URL$")
	public void user_should_be_able_to_navigate_to_the_required_URL(){
	    // Write code here that turns the phrase above into concrete actions
	 
	}

	@Then("^Get all the Links on the web page$")
	public void get_all_the_Links_on_the_web_page(){
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("^Click on all the links in the documentation page and check for (\\d+)XX response status$")
	public void click_on_all_the_links_in_the_documentation_page_and_check_for_XX_response_status(int arg1) {
	    // Write code here that turns the phrase above into concrete actions

	}

	@Then("^Validate Angular JS is initialized on the page or not$")
	public void validate_Angular_JS_is_initialized_on_the_page_or_not() {
	    // Write code here that turns the phrase above into concrete actions

	}

}