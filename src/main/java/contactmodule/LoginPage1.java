package contactmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutilities.WebDriverUtility4;

import contact.genericuti.wdvrutility;

public class LoginPage1 extends wdvrutility {
// Declaration
	@FindBy(xpath="//input[@name='user_name']")private WebElement untxt;
	@FindBy(xpath="//input[@name='user_password']")private WebElement pwdtxt;
	@FindBy(xpath="//input[@type='submit']")private WebElement loginBtn;
//initialization
	public LoginPage1(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
// Getters

	public WebElement getUtxt() {
		return untxt;
	}

	public WebElement getPwdxt() {
		return pwdtxt;
	}

	public WebElement getLoginbtn() {
		return loginBtn;
	}
	//Business Library
		public void loginToApp(String UN,String PWD) {
			untxt.sendKeys(UN);
			pwdtxt.sendKeys(PWD);
			loginBtn.click();
		}
	}


