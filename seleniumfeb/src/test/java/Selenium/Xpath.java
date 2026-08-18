package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Xpath {

	public static void main(String[] args) {
    //Relative two formulas only 
		//contains
		//TagName[contains(@attribuite,'value')];
		//text
		//TagName[Text()='value'];
		
		
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--guest");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com");
		
		WebElement un=driver.findElement(By.xpath("//input[contains(@type,'text')]"));
		WebElement pass=driver.findElement(By.xpath("//input[contains(@placeholder,'Password')]"));
		WebElement log=driver.findElement(By.xpath("//input[contains(@name,'login-button')]"));  
		
		un.sendKeys("standard_user");
		pass.sendKeys("secret_sauce");
		log.click();
		
		
		
	}

}
