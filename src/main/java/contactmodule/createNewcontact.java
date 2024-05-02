package contactmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutilities.WebDriverUtility4;

import contact.genericuti.wdvrutility;

public class createNewcontact extends wdvrutility {
	//Declaration
	@FindBy(xpath="//input[@name='lastname']")private WebElement contlastNameedt;
	@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement saveBtn;
//Initialization
	public createNewcontact(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
//Getters
	public WebElement getContlastNameedt() {
		return contlastNameedt;
	}
	public WebElement getSaveBtn() {
		return saveBtn;
	}
	
	//Business Library
		public void createNewcontact(String conlstname)
		{
			contlastNameedt.sendKeys(conlstname);
			saveBtn.click();
		}
		
}


