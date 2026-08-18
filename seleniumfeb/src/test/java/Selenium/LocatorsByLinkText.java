package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsByLinkText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ChromeOptions co=new ChromeOptions();
    co.addArguments("--guest");
    WebDriver driver=new ChromeDriver(co);
    driver.manage().window().maximize();
    driver.get("https://www.saucedemo.com"); 
    WebElement un=driver.findElement(By.id("user-name"));
    WebElement pw=driver.findElement(By.id("password"));
    WebElement log=driver.findElement(By.id("login-button"));

    un.sendKeys("standard_user");
    pw.sendKeys("secret_sauce");
    log.click();
    
    WebElement name=driver.findElement(By.linkText("Twitter"));
    WebElement nam=driver.findElement(By.partialLinkText("Face"));
    
    name.click();
    nam.click();
           
           
           
	}

}
