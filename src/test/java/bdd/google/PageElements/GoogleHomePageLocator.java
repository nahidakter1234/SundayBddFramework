package bdd.google.PageElements;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleHomePageLocator {

	
	@FindBy (xpath= "//*[@title='Search']")
	public WebElement searchBox;
	
	@FindBy (xpath= "//*[@value='Google Search']")
	public WebElement searchgoogletab;
	
	
	
}
