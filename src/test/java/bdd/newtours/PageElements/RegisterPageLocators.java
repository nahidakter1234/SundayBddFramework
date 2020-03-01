package bdd.newtours.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPageLocators {
	
	//First Name Locator
	@FindBy (xpath="//input[@name='firstName']")
	public WebElement FirstName;
	
	//Last Name locator
	@FindBy (xpath="//input[@name='lastName']")
	public WebElement LastName;
	
	//Phone locator
	
	@FindBy (xpath="//input[@name='phone']")
	public WebElement Phone;
	
	//Email locator
	@FindBy (xpath="//input[@id='userName']")
	public WebElement Email;
	
	
	//webelement address line 1
	@FindBy (xpath="//input[@name='address1']")
	public WebElement AddressLine1;
	//webelement address line 2
	@FindBy (xpath="//input[@name='address2']")
	public WebElement AddressLine2;	
	//webelement City
	@FindBy (xpath="//input[@name='city']")
	public WebElement City;
//webelement State
	@FindBy (xpath="//input[@name='state']")
	public WebElement State;
	//webelement  postal code
	@FindBy (xpath="//input[@name='postalCode']")
	public WebElement PostalCode;
	
	//webelement country
	@FindBy (xpath="//select[@name='country']")
	public WebElement Country;

// webelement user info
	@FindBy (xpath="//input[@id='email']")
	public WebElement Username;
	
	@FindBy (xpath="//input[@name='password']")
	public WebElement Password;
	
	@FindBy (xpath="//input[@name='confirmPassword']")
	public WebElement ConfirmPass;
	// webelement Submit
	@FindBy (xpath="//input[@name='register']")
	public WebElement Submit;

}