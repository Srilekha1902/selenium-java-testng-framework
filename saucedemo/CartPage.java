package com.srilekha.saucedemo;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class CartPage {
	WebDriver driver;
	Actions actions;
	
	public CartPage(WebDriver driver) {
		this.driver=driver;
		this.actions=new Actions(driver);
		
	}
	public void OptionsDropDown() {
		Select dropdown=new Select(driver.findElement(By.xpath("//select[contains(@class,'product_sort_container')]")));
		dropdown.selectByVisibleText("Name (A to Z)");
	}
			
public void jse() {
	
	JavascriptExecutor js= (JavascriptExecutor) driver;
	WebElement j=driver.findElement(By.xpath("//a[text()='Twitter']"));
	js.executeScript("arguments[0].scrollIntoView(true)", j);
}


public void ProductAddingToCartBackPacks() {
	
	
	WebElement backPack = driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
	 if(backPack.getText().equals("Sauce Labs Backpack"))
	 {
		 System.out.println("String message :" + backPack.getText());
		 WebElement backbutton=driver.findElement(By.xpath("//button[contains(@id,'add-to-cart-sauce-labs-backpack')]"));
		 actions.click(backbutton).build().perform();
	 }
	 else {
	     System.out.println("Product name mismatch — not adding to cart");
	      }
	
	
}

public void SecondProductAddingToCart() {
	WebElement redtshrt=driver.findElement(By.xpath("//button[contains(@data-test,'add-to-cart-test.allthethings()-t-shirt-(red)')]"));
	actions.click(redtshrt).build().perform();
}



public void ToCheckoutAllProducts() {
WebElement cart=driver.findElement(By.xpath("//a[contains(@data-test,'shopping-cart-link')]"));
actions.click(cart).build().perform();
WebElement checkout=driver.findElement(By.xpath("//button[contains(@data-test,'checkout')]"));
actions.click(checkout).build().perform();
driver.findElement(By.id("first-name")).sendKeys("Srilekha");
driver.findElement(By.id("last-name")).sendKeys("Shanmugam");
driver.findElement(By.id("postal-code")).sendKeys("32453");
WebElement b=driver.findElement(By.id("continue"));
actions.click(b).build().perform();
WebElement fb=driver.findElement(By.id("finish"));
actions.click(fb).build().perform();
WebElement gp=driver.findElement(By.id("generate-pdf-order"));
actions.click(gp).build().perform();
}

public void NavigateToCheckout() {
	WebElement cart=driver.findElement(By.xpath("//a[contains(@data-test,'shopping-cart-link')]"));
	actions.click(cart).build().perform();
	WebElement checkout=driver.findElement(By.xpath("//button[contains(@data-test,'checkout')]"));
	actions.click(checkout).build().perform();
}

public void ClickContinue() {
	WebElement b=driver.findElement(By.id("continue"));
	actions.click(b).build().perform();
}
public void FormFillingWithInvalidFirstName(String m){
	driver.findElement(By.xpath("//input[contains(@data-test,'firstName')]")).sendKeys(m);
}
public void FormFillingWithInvalidLastName(String n) {
	driver.findElement(By.xpath("//input[contains(@data-test,'lastName')]")).sendKeys(n);
}
public void FormFillingWithInvalidPostalCode(String o) {
    driver.findElement(By.id("postal-code")).sendKeys(o);
}



public String getErrorMsgForForm() {
	return driver.findElement(By.cssSelector("[data-test='error']")).getText();
}

}
