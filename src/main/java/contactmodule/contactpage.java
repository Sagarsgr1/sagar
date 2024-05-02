package contactmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import contact.genericuti.wdvrutility;

public class contactpage extends wdvrutility{
	//Declaration
	@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement contLookUpImg;
//Initialization
	public contactpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	//Getters
		
}
	public WebElement getContLookUpImg() {
		return contLookUpImg;
	}
	//Business Library
	public void clickOncontLookUpImg() {
		contLookUpImg.click();
	}
}

