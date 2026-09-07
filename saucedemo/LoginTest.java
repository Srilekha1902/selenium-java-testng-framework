package com.srilekha.saucedemo;

import org.testng.annotations.Test;
import org.testng.Assert;

public class LoginTest extends BaseTest{

@Test
public void ToVerifyWithValidLoginCred(){

LoginPage loginPage=new LoginPage(driver);
loginPage.ValidUserName();
loginPage.ValidPassword();
loginPage.LoginButtonV();
}

@Test
public void ToVerifyWithInValidUserCred() {
LoginPage loginPage=new LoginPage(driver);
loginPage.InValidUserName("gdsd");
loginPage.InValidPassword("2672");
loginPage.LoginButtonIV();

String errmsg=loginPage.getErrorMessage();
System.out.println("String error message:" + errmsg);
Assert.assertTrue(errmsg.contains("do not match"));

}

}


