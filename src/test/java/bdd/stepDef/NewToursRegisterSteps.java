package bdd.stepDef;

import bdd.newtours.PageActions.NewTourHomePageAction;
import bdd.newtours.PageActions.RegisterConfrPageAction;
import bdd.newtours.PageActions.RegisterPageAction;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class NewToursRegisterSteps {
	
	RegisterPageAction pageAction = new RegisterPageAction(); 
	
	NewTourHomePageAction homePage = new  NewTourHomePageAction();
	RegisterConfrPageAction registerAction = new RegisterConfrPageAction();

@Given("^Browse to Newtours homepage$")
public void browse_to_Newtours_homepage() throws Throwable {
	homePage.launchNewToursHomepage();
}
@When("^Navigate to Register page$")
public void navigate_to_Register_page() throws Throwable {
	homePage.NavigateToRegisterPage();
}

@When("^Fill form with some basic information$")
public void fill_form_with_some_basic_information() throws Throwable {
	pageAction.fillUpContactinfo();
	pageAction.fillUpMaillinginfo();
	
}

@When("^Complete creating account with \"([^\"]*)\"$")
public void complete_creating_account_with(String UserName) throws Throwable {
   pageAction.fillUpUserinfo(UserName);
   pageAction.submitForm();
}



@Then("^Verify account created successfully$")
public void verify_account_created_successfully() throws Throwable {
	registerAction.verifyThankyouRegister();
	
	
  
}

}
