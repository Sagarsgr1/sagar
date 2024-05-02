package com.vtiger.genericutilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.vtiger.pomclasses.CreateNewOrganizationPage4;
import com.vtiger.pomclasses.LoginPage1;
import com.vtiger.pomclasses.OrganizationInformationPage5;

public class Baseclass {
	public Propertyfileutility2 pu=new Propertyfileutility2();
	public ExcelFileUtility3 eu=new ExcelFileUtility3();
	public JavaUtility1 ju=new JavaUtility1();
	public WebDriverUtility4 wu=new WebDriverUtility4();
	public WebDriver driver=null;//for runtime polymorphism
	@BeforeSuite
	public void bsconfig() {
		System.out.println("====DB CONNECTION=====");
	}
	@AfterSuite
	public void  asconfig() {
		System.out.println("====DB DISCONNECTION==== ");
	}
	@BeforeClass
	public void bcconfig() throws Throwable {
		String BROWSER = pu.readDataFroomPropertyFile("browser");
		String URL = pu.readDataFroomPropertyFile("url");
		if(BROWSER.equalsIgnoreCase("edge")) {
			driver=new EdgeDriver();
			System.out.println("Edge driver is Launched");
		}
		else if(BROWSER.equalsIgnoreCase("chrome")) {
			driver=new ChromeDriver();
			System.out.println("chrome driver is Launched");
		}
		else 
		{
			System.out.println("Invalid browser name");
		}
		driver.get(URL);
		wu.getScreenshot(driver,"LoginPage1");
		wu.maximizeBrowserWindow(driver);
		wu.waitforpageload(driver);
	}
	@AfterClass
	public void terDown() {
		driver.quit();
	}
	@BeforeMethod
	public void bmconfig() throws Throwable {
		String UN = pu.readDataFroomPropertyFile("un");
		String PWD = pu.readDataFroomPropertyFile("pwd");
		
	LoginPage1 lp=new LoginPage1(driver);
	lp.loginToApp(UN, PWD);
	wu.getScreenshot(driver,"Homepage");
	CreateNewOrganizationPage4 CNOP=new CreateNewOrganizationPage4(driver);
    wu.getScreenshot(driver,"CreateNewOrganizationPage4");
	}

	@AfterMethod
	public void amconfig() {
		System.out.println("Logout from app");
	}


	}

