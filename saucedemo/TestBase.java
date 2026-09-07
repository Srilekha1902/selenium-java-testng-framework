package com.srilekha.saucedemo;
import org.openqa.selenium.io.FileHandler;

import java.io.File;
import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class TestBase {
	public static WebDriver driver;//used as global so every method can access it
	public static WebDriverWait ww;
	public static Actions a;

//browser it redirect to chrome using guest login
public static void BroswerSetup() {
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--guest");
    driver = new ChromeDriver(co);
	ww=new WebDriverWait(driver, Duration.ofSeconds(10));
	a=new Actions(driver);
}

//it maximize the window
public static void max() {
	driver.manage().window().maximize();
}

//redirect to url
public static void urll(String url) {
	driver.get(url);
}

//It used for login purspose
public static void login() {
WebElement un=	driver.findElement(By.id("user-name"));
WebElement pw=	driver.findElement(By.id("password"));

un.sendKeys("standard_user");
pw.sendKeys("secret_sauce");
}

//login button
public static void lb() {
WebElement login= driver.findElement(By.id("login-button"));
login.click();
}


public static void ss(String name) {
	try {
	File f=new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources\\"+name+".png");
	TakesScreenshot ts= (TakesScreenshot)driver;
	File cap=ts.getScreenshotAs(OutputType.FILE);
	FileHandler.copy(cap, f);
	}
	catch (Exception e) {
		e.printStackTrace();
	}
	
}

//it wil come out of the windown
public static void TearDown() {
	driver.quit();
}

}
