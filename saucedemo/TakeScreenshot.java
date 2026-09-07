package com.srilekha.saucedemo;
import java.io.File;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TakeScreenshot extends TestBase{
  public static void ts(String name) {
	  try {
	 File f=new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources\\"+name+".png");
	 TakesScreenshot ts=(TakesScreenshot)driver;
	 File cap=ts.getScreenshotAs(OutputType.FILE);
	 FileHandler.copy(cap, f);
  }
	  catch (Exception e) {
		// TODO: handle exception
	}
  }
  
		
  
	public static void main(String[] args) {
		TakeScreenshot.BroswerSetup();
		TakeScreenshot.max();
		TakeScreenshot.urll("https://www.saucedemo.com");
		TakeScreenshot.ts("HomePage");

	}

}
