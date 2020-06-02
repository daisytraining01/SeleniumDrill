package com.ether.steps;

import org.openqa.selenium.By;

import com.ether.base.SeleniumDriver;
//import com.ether.pages.actions.LoginPageActions;
import com.ether.pages.locators.LoginPageLocators;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	LoginPageLocators loginPageLocators = new LoginPageLocators();
	 @Given("^navigate to the \"([^\"]*)\"$")
	    public void navigate_to_the_something(String url) throws Throwable {
	        SeleniumDriver.openPage(url);
	    }
	 @And("^User is loggedin to the application with the \"([^\"]*)\" and \"([^\"]*)\" in Browser$")
	    public void user_is_loggedin_to_the_application_with_the_something_and_something_in_browser(String username, String password) throws Throwable {
		 loginPageLocators.username.sendKeys(username);
		 loginPageLocators.password.sendKeys(password);
		 loginPageLocators.signIn.click();
	    }
	 @When("^user click on primary account details$")
	    public void user_click_on_primary_account_details() throws Throwable {
	        SeleniumDriver.getDriver().findElement(By.xpath("//div[@class='panel panel-info']//span[@class='pull-left'][contains(text(),'View Details')]"));
	    }

	    @Then("^User lands on Account details Tab$")
	    public void user_lands_on_account_details_tab() throws Throwable {
	        System.out.println("User lands on Account details Tab");
	    }

	    

	    @And("^Logs out of the application$")
	    public void logs_out_of_the_application() throws Throwable {
	        
	    }
}
