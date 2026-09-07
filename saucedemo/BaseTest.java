package com.srilekha.saucedemo;
import java.io.File;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
WebDriver driver;

@BeforeMethod
public void GuestBrowserLogin() {
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--guest");
	driver=new ChromeDriver(co);
	driver.get("https://www.saucedemo.com");
	driver.manage().window().maximize();
	
}

@AfterMethod
public void TearDown(ITestResult result) {
	String name=result.getName();
	
	try {
		File f=new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources\\"+name+".png");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File cap= ts.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(cap, f);
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	driver.quit();
}


}

