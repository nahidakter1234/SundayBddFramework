package bdd.newtours.PageActions;


import org.testng.Assert;

import bdd.newtours.PageElements.RegisterConfrPageLocators;

public class RegisterConfrPageAction {

	RegisterConfrPageLocators registerConfrPageLocatorobj = new RegisterConfrPageLocators();
	
	public void verifyThankyouRegister(){
		String config = registerConfrPageLocatorobj.TxtThankYou.getText();
		Assert.assertEquals(config,"Thank You for registering, You may now sign-in using the user name and password" );
	}
	

}
