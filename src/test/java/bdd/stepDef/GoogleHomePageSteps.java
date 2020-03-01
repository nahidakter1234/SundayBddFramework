package bdd.stepDef;

import bdd.google.PageActions.GoogleHomePageAction;
import bdd.google.PageElements.GoogleHomePageLocator;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class GoogleHomePageSteps {
	GoogleHomePageAction GoogleHomePageActionobj = new  GoogleHomePageAction();
	GoogleHomePageLocator GoogleHmePageLocatorobj = new GoogleHomePageLocator();
	
	
	@Given("^Browse to Google homepage$")
	public void browse_to_Google_homepage() throws Throwable {
		GoogleHomePageActionobj.launchgooglehomepage();
	}

	@When("^Search by \"([^\"]*)\"$")
	public void search_by(String Keyword) throws Throwable {
	GoogleHomePageActionobj.searchforcars(Keyword);
	}

	@Then("^Verify search result appear$")
	public void verify_search_result_appear() throws Throwable {
		System.out.println("***** I AM A GeNIUS ***");
	}



}
