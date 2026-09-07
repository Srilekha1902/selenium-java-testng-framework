package com.srilekha.saucedemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ProductValidation extends TestBase {
	
  public static void textverify() {
	  WebElement swagtest= driver.findElement(By.xpath("//div[text()='Swag Labs']"));
		
		//to select text we have to use gettext()
		ww.until(ExpectedConditions.visibilityOf(swagtest));
		//Driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String a=swagtest.getText();
		if(a.equals("Swag Labs"))
		{
			System.out.println("Successfully verified");
		}
		else {
			System.out.println("Not done");
		}
		
  }
	public static void main(String[] args) {
		
			ProductValidation.BroswerSetup();
			ProductValidation.urll("https://www.saucedemo.com/");
			ProductValidation.max();
			ProductValidation.login();
			ProductValidation.lb();
			ProductValidation.textverify();
		}
	
	  
		
}

