package bdd.newtours.PageActions;

import org.openqa.selenium.support.ui.Select;

import bdd.newtours.PageElements.RegisterPageLocators;
import bdd.utilities.ReadExcelSheetData;

public class RegisterPageAction {
	RegisterPageLocators Pagelocator = new RegisterPageLocators();
	ReadExcelSheetData ExcelData = new ReadExcelSheetData();

	public void fillUpContactinfo(){
		Pagelocator.FirstName.sendKeys("Nahid");
		Pagelocator.LastName.sendKeys("Akter");
		Pagelocator.Phone.sendKeys("6666666666");
		Pagelocator.Email.sendKeys("nahidakter@hotmail.com");
	}
	public void fillUpMaillinginfo(){
		Pagelocator.AddressLine1.sendKeys("jamaica NY");
		Pagelocator.AddressLine2.sendKeys("USA");
		Pagelocator.City.sendKeys("Queens");
		Pagelocator.State.sendKeys("New York");
		Pagelocator.PostalCode.sendKeys("11433");
		
		Select mydrpdwn = new Select (Pagelocator.Country);
		mydrpdwn.selectByVisibleText("UNITED STATES");
	}
	public void fillUpUserinfo(String UserName){
		Pagelocator.Email.sendKeys("nahidakter@hotmail.com");
		Pagelocator.Password.sendKeys("12345");
		Pagelocator.ConfirmPass.sendKeys("12345");	
		
	}
	public void submitForm(){
		Pagelocator.Submit.click();
	}
	
}
