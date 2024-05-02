package com.vtiger.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.vtiger.genericutilities.WebDriverUtility4;

public class CreateNewOrganizationPage4 extends WebDriverUtility4 {

		//Declaration
			@FindBy(xpath="//input[@name='accountname']")private WebElement orgNameedt;
			@FindBy(xpath="//input[@title='Save [Alt+S]']")private WebElement saveBtn;
		//Initialization
			public CreateNewOrganizationPage4(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
		//Getters
			public WebElement getOrgNameedt() {
				return orgNameedt;
			}
			public WebElement getSaveBtn() {
				return saveBtn;
			}
			//Business Library
			public void createNewOrganization(String ORGNAME)
			{
				orgNameedt.sendKeys(ORGNAME);
				saveBtn.click();
			}
}
