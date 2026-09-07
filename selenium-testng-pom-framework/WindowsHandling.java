package com.srilekha.saucedemo;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WindowsHandling extends TestBase {
    public static void wh() {
    	//List<WebElement> mb=driver.findElements(By.xpath("//ul[contains(@class,'social')]/li"));
  WebElement  tw=driver.findElement(By.xpath("//a[text()='Twitter']"));
  WebElement  fb=driver.findElement(By.xpath("//a[text()='Facebook']"));
  WebElement  ln=driver.findElement(By.xpath("//a[text()='LinkedIn']"));
  
       tw.click();
       fb.click();
       ln.click();
    	
    	
    		//driver.close();
            String h=driver.getWindowHandle();
            System.out.println(h);
            
            Set<String> k=driver.getWindowHandles();
            for(String n:k)
            {
            	System.out.println(n);
            	driver.switchTo().window(n);
            	String bv=driver.getTitle();
            	System.out.println(bv);
            	
            	if(bv.equals("Sauce Labs | LinkedIn")) { 
            		
            WebElement go=driver.findElement(By.xpath("//span[contains(@class,'self-center')]"));           		
            		a.click(go).build().perform();
            	}
            	
            }
    }
    
	public static void main(String[] args) {

      WindowsHandling.BroswerSetup();
      WindowsHandling.max();
      WindowsHandling.urll("https://www.saucedemo.com");
      WindowsHandling.login();
      WindowsHandling.lb();
      WindowsHandling.wh();
     
	}

	
}
