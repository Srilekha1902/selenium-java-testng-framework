package com.srilekha.saucedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class DemoHomepage extends TestBase{
 
	public static void demo(String name) {
	WebElement button=	driver.findElement(By.xpath("//span[text()='right click me']"));
	a.contextClick(button).build().perform();
	
	List<WebElement> li=driver.findElements(By.xpath("//ul[contains(@class,'context-menu-list context-menu-root')]/li"));
	for(WebElement d:li)
	{
		System.out.println(d.getText());
		
		if(d.getText().equals(name)) 
			
		{
			a.click(d).build().perform();
			break;
		}
	}
	
	String ff=driver.switchTo().alert().getText();
	System.out.println(ff);
	driver.switchTo().alert().accept();
	}
	public static void main(String[] args) {
		DemoHomepage.BroswerSetup();
		DemoHomepage.max();
		DemoHomepage.urll("https://swisnl.github.io/jQuery-contextMenu/demo.html");
	    DemoHomepage.demo("Delete");

	}

}
