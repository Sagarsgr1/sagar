package com.vtiger.genericutilities;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility4 {
		public void maximizeBrowserWindow(WebDriver driver) {
			driver.manage().window().maximize();
		}
		public void minimizeBrowserWindow(WebDriver driver) {
			driver.manage().window().minimize();
		}
		public void waitforpageload(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		}
		public void handleDropdown(WebElement element,int index) {
			Select s=new Select(element);
			s.selectByIndex(index);
		}
		public void handleDropdown(WebElement element,String value) {
			Select s=new Select(element);
			s.selectByValue(value);
		}
		public void handleDropdown(String visibletext,WebElement element) {
			Select s=new Select(element);
			s.selectByVisibleText(visibletext);
		}
		//Action class
		public void mouseOverAction(WebDriver driver,WebElement element) {
			Actions a=new Actions(driver);
			a.moveToElement(element).perform();
		}
		public void rightClick(WebDriver driver,WebElement element) {
			Actions a=new Actions(driver);
			a.contextClick(element).perform();
		}
		public void doubleClick(WebDriver driver,WebElement element) {
			Actions a=new Actions(driver);
			a.doubleClick(element).perform();
		}
		public void dragandDrop(WebDriver driver,WebElement srcele,WebElement destele) {
			Actions a=new Actions(driver);
			a.dragAndDrop(srcele,destele).perform();
		}
		public void getScreenshot(WebDriver driver,String pageNames) {
			TakesScreenshot ts=(TakesScreenshot)driver;
			File src=ts.getScreenshotAs(OutputType.FILE);
			File dest=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Vtiger\\src\\main\\resources\\Screenshot\\"+pageNames+".png");
			try {
				Files.copy(src, dest);
			}
			catch (IOException e) {
				e.printStackTrace();
			
			}
			}
		
			
		}

