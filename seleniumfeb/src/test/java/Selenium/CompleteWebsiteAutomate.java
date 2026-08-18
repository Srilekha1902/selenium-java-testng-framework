package Selenium;
import java.io.File;
import java.time.Duration;

import org.apache.commons.compress.harmony.pack200.NewAttribute;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.MemberSubstitution.Current;


public class CompleteWebsiteAutomate{
	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.addArguments("--guest");
		WebDriver driver=new ChromeDriver(co);
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
	     WebElement un=driver.findElement(By.id("user-name"));
	     WebElement pw=driver.findElement(By.id("password"));
	     WebElement log=driver.findElement(By.id("login-button"));
	     
	     un.sendKeys("standard_user");
	     pw.sendKeys("secret_sauce");
	     log.click();
		
	WebElement t=driver.findElement(By.xpath("//div[text()='Swag Labs']"));
	String s=t.getText();
	
	if(s.equals("Swag Labs")) {
		System.out.println("Successfully logged in ");
	}
	else {
		System.out.println("Not done");
	}
	
	WebElement a=driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
	a.click();
	
	WebElement l=driver.findElement(By.xpath("//a[contains(@data-test,'shopping-cart-link')]"));
	l.click();
	
	WebElement c=driver.findElement(By.id("checkout"));
	c.click();
	
WebElement fin=driver.findElement(By.xpath("//input[contains(@placeholder,'First Name')]"));
WebElement las=driver.findElement(By.xpath("//input[contains(@data-test,'lastName')]"));
WebElement pc=driver.findElement(By.xpath("//input[contains(@data-test,'postalCode')]"));

fin.sendKeys("Srilekha");
las.sendKeys("Harikaran");
pc.sendKeys("987698");

WebElement con=driver.findElement(By.id("continue"));
con.click();
WebElement f =driver.findElement(By.id("finish"));
f.click();

WebElement g=driver.findElement(By.id("generate-pdf-order"));
g.click();

String downloadpath="C:\\Users\\srilekha\\Downloads\\Testing";
WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(50));
System.out.println("Started time:" + System.currentTimeMillis());
wait.until(d->new File(downloadpath).exists());
System.out.println("ended time:" + System.currentTimeMillis());
System.out.println("Downloaded successfully");

WebElement b=driver.findElement(By.id("back-to-products"));
b.click();		
		
	    
	}
	

}
