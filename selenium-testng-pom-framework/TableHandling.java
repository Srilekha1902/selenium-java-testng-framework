package com.srilekha.saucedemo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TableHandling extends TestBase{
	public static void tb() {
List<WebElement>row=driver.findElements(By.xpath("//table[contains(@id,'courses_table')]//tbody//tr"));
List<WebElement>col=driver.findElements(By.xpath("//table[contains(@id,'courses_table')]//tbody//tr[1]//td"));


	
	for(int i =1;i<=row.size();i++)
	{
		for(int j = 1;j<=col.size();j++)
		{
		WebElement fi=driver.findElement(By.xpath("//table[contains(@id,'courses_table')]//tbody//tr["+i+"]//td["+j+"]"));
			System.out.println(fi.getText());
		}
	}
}



	
	public static void main(String[] args) {
		TableHandling.BroswerSetup();
		TableHandling.max();
		TableHandling.urll("https://practicetestautomation.com/practice-test-table");
		TableHandling.tb();
	}

}
