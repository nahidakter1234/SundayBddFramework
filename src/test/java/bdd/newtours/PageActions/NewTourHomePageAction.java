package bdd.newtours.PageActions;

import java.util.concurrent.TimeUnit;

import bdd.newtours.PageElements.HomePageLocators;
import bdd.utilities.SetupDrivers;

public class NewTourHomePageAction {
	HomePageLocators newtourHome = new HomePageLocators();
	
	
public void launchNewToursHomepage(){
	SetupDrivers.driver.get("https://www.walmart.com/");
	SetupDrivers.driver.manage().window().maximize();
	SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
}
public void NavigateToRegisterPage(){
	newtourHome.RegisterButton.click();
}


}
