package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserAutomation {

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().window().minimize();
	driver.manage().window().maximize();
	driver.navigate().forward();
	driver.navigate().back();
	driver.navigate().refresh();
	driver.get("https://www.youtube.com/");
	driver.quit();
	
}
}
