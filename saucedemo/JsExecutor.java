package com.srilekha.saucedemo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class JsExecutor extends TestBase {
   public static void jse() {
	   //jwjtj
	   
	JavascriptExecutor js= (JavascriptExecutor)driver;
	WebElement  tw=driver.findElement(By.xpath("//a[text()='Twitter']"));
	js.executeScript("arguments[0].scrollIntoView(true)",tw);
	TakeScreenshot.ts("twpresent");
	js.executeScript("arguments[0].click();",tw);
	
   }
	public static void main(String[] args) {
		
          JsExecutor.BroswerSetup();
          JsExecutor.max();
          JsExecutor.urll("https://www.saucedemo.com");
          JsExecutor.login();
          JsExecutor.lb();
          JsExecutor.jse();
        
	}

}
