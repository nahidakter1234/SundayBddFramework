package bdd.google.PageActions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import bdd.google.PageElements.GoogleHomePageLocator;

import bdd.utilities.SetupDrivers;



public class GoogleHomePageAction {
	GoogleHomePageLocator GoogleHomePageLocatorobj;	

public GoogleHomePageAction(){
	
	GoogleHomePageLocatorobj = new GoogleHomePageLocator();
	PageFactory.initElements(SetupDrivers.driver, GoogleHomePageLocatorobj);
	
}

	
	public void launchgooglehomepage(){
	
	SetupDrivers.driver.get("https://www.google.com/");
	SetupDrivers.driver.manage().window().maximize();
	SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

	
}
	public void searchforcars(String Keyword){
		GoogleHomePageLocatorobj.searchBox.click();
		GoogleHomePageLocatorobj.searchBox.sendKeys(Keyword);
	    SetupDrivers.driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		GoogleHomePageLocatorobj.searchgoogletab.click();
		
	
		
	}
}