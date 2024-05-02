package contactmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import contact.genericuti.wdvrutility;

public class contactInformationpage extends wdvrutility {
	@FindBy(xpath = "//span[@class='dvHeaderText']")
	private WebElement ContHeaderText;

	public contactInformationpage (WebDriver driver) //test script
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getContHeaderText() {
		return ContHeaderText;
	}
	//Business Library
		public String getHeader()
		{
			return ContHeaderText.getText();
		}
	
}

