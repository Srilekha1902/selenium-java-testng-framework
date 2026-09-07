package com.srilekha.saucedemo;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {
    WebDriver driver;
   
    
   public LoginPage(WebDriver driver) {
	   this.driver=driver;
   } 
   
   public  void ValidUserName() {
	   driver.findElement(By.id("user-name")).sendKeys("standard_user");
   }
   public  void ValidPassword() {
	   driver.findElement(By.id("password")).sendKeys("secret_sauce");
}
   public  void LoginButtonV() {
	   driver.findElement(By.id("login-button")).click();
	   
   }
   
   public  void InValidUserName(String un) {
	   driver.findElement(By.id("user-name")).sendKeys(un);
   }
   public  void InValidPassword(String pw) {
	   driver.findElement(By.id("password")).sendKeys(pw);
   }
   public  void LoginButtonIV() {
	   driver.findElement(By.id("login-button")).click();
	   
   }
   public String getErrorMessage() {
	   return driver.findElement(By.cssSelector("[data-test='error']")).getText();
   }
}


