package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LocatorsByName {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--guest");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/v3/signin/identifier?authuser=0&continue=https://myaccount.google.com/?utm_source%3Dsign_in_no_continue%26pli%3D1&dsh=S2081935580:1787042694421344&ec=GAlAwAE&hl=en&flowName=GlifWebSignIn&flowEntry=AddSession");
		
		WebElement un= driver.findElement(By.name("identifier"));
		un.sendKeys("srilekha0219@gmail.com");
		
	}

}
