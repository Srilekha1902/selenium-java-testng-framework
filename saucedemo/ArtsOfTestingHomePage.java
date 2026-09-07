package com.srilekha.saucedemo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ArtsOfTestingHomePage extends TestBase{
    public static void doubleclick() {
    	WebElement dc=driver.findElement(By.xpath("//button[text()='Double-click to generate alert box']"));
    	a.moveToElement(dc).build().perform();
    	a.doubleClick(dc).build().perform();
    	String alert=driver.switchTo().alert().getText();
    	System.out.println(alert);
    	driver.switchTo().alert().accept();
    	
    	WebElement target=driver.findElement(By.xpath("//div[contains(@id,'targetDiv')]"));
    	
    	WebElement src=driver.findElement(By.xpath("//img[contains(@id,'myImage')]"));
    	
    	a.clickAndHold(target).build().perform();
    	a.dragAndDrop(src, target).build().perform();
        
    	
    }
	public static void main(String[] args) {
		ArtsOfTestingHomePage.BroswerSetup();
		ArtsOfTestingHomePage.max();
		
		ArtsOfTestingHomePage.urll("https://artoftesting.com/samplesiteforselenium");
		ArtsOfTestingHomePage.doubleclick();
		ArtsOfTestingHomePage.TearDown();
   
	}

}
