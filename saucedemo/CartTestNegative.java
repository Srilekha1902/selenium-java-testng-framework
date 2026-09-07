package com.srilekha.saucedemo;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CartTestNegative extends BaseTest{
	
@BeforeMethod
public void Login() {
	LoginPage loginPage=new LoginPage(driver);
	loginPage.ValidUserName();
	loginPage.ValidPassword();
	loginPage.LoginButtonV();
}


@Test
public void ToVerifyNavigateToCheckout() {
	CartPage cartPage=new CartPage(driver);
	cartPage.ProductAddingToCartBackPacks();
	cartPage.SecondProductAddingToCart();
	cartPage.NavigateToCheckout();
}
@Test
public void ToVerifyClickContinue()
{
	CartPage cartPage=new CartPage(driver);
	cartPage.ProductAddingToCartBackPacks();
	cartPage.SecondProductAddingToCart();
	cartPage.NavigateToCheckout();
	cartPage.ClickContinue();
	
}

@Test
public void ToVerifyFormFillingWithInvalidFirstName() {
	CartPage cartPage=new CartPage(driver);
	cartPage.ProductAddingToCartBackPacks();
	cartPage.SecondProductAddingToCart();
	cartPage.NavigateToCheckout();
    cartPage.FormFillingWithInvalidFirstName("");
	cartPage.FormFillingWithInvalidLastName("Shanmugam");
	cartPage.FormFillingWithInvalidPostalCode("12345");
	cartPage.ClickContinue();
	String em=cartPage.getErrorMsgForForm();
	System.out.println("String error message:" + em);
	Assert.assertTrue(em.contains("First Name is required"));
}
@Test
public void ToVerifyFormFillingWithInvalidLastName(){
    CartPage cartPage=new CartPage(driver);
	cartPage.ProductAddingToCartBackPacks();
	cartPage.SecondProductAddingToCart();
	cartPage.NavigateToCheckout();
	cartPage.FormFillingWithInvalidFirstName("Srilekha");
    cartPage.FormFillingWithInvalidLastName("");
    cartPage.FormFillingWithInvalidPostalCode("12453");
    cartPage.ClickContinue();
	String el=cartPage.getErrorMsgForForm();
	System.out.println("String error message:" + el);
	Assert.assertTrue(el.contains("Last Name is required"));
}


@Test
public void ToVerifyFormFillingWithInvalidZipCode() {
	CartPage cartPage=new CartPage(driver);
	cartPage.ProductAddingToCartBackPacks();
	cartPage.SecondProductAddingToCart();
	cartPage.NavigateToCheckout();
	cartPage.FormFillingWithInvalidFirstName("Srilekha");
	cartPage.FormFillingWithInvalidLastName("Shanmugam");
	cartPage.FormFillingWithInvalidPostalCode("");
	cartPage.ClickContinue();
	String hs=cartPage.getErrorMsgForForm();
	
	System.out.println("String Error Message:" + hs);
	Assert.assertTrue(hs.contains("Postal Code is required"));
}


   
}
