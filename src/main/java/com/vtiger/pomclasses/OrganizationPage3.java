package com.vtiger.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutilities.WebDriverUtility4;

public class OrganizationPage3 extends WebDriverUtility4 {

		//Declaration
			@FindBy(xpath="//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement orgLookUpImg;
		//Initialization
			public OrganizationPage3(WebDriver driver) {
				PageFactory.initElements(driver,this);
			//Getters
				
		}
			public WebElement getOrgLookUpImg() {
				return orgLookUpImg;
			}
			//Business Library
			public void clickOnOrgLookUpImg()
			{
				orgLookUpImg.click();
			}
}
