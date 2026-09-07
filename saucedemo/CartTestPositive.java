package com.srilekha.saucedemo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTestPositive extends BaseTest{
	
@BeforeMethod
public void Login() {
	LoginPage loginPage=new LoginPage(driver);
	loginPage.ValidUserName();
	loginPage.ValidPassword();
	loginPage.LoginButtonV();
}
@Test
public void ToVerifyjse() {
	CartPage cartPage=new CartPage(driver);
	cartPage.jse();
}
@Test
public void ToVerifyOptionsDropDown() {
	CartPage cartPage=new CartPage(driver);
	cartPage.OptionsDropDown();
}



@Test
public void ToVerifyProductAddingToCartBackPacks() {
	CartPage cartPage=new CartPage(driver);
	cartPage.ProductAddingToCartBackPacks();
}

@Test
public void ToVerifySecondProductAddingToCart() {
	CartPage cartPage=new CartPage(driver);
	cartPage.SecondProductAddingToCart();
}
@Test
public void ToVerifyToCheckeOutAllProducts() {
	CartPage cartPage=new CartPage(driver);
	cartPage.ToCheckoutAllProducts();
}

   
}
