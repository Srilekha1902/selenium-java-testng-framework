package com.srilekha.saucedemo;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class RobotScreenshot extends TestBase {
    public static void rs(String name) {
    	//1.create robot
    	//2.robot ask what size is ur comp  rdrfbi
    	//3.rectangle draw
    	//4.buffered img
    	//5.Image copy to my folder
    	try {
			Robot rb=new Robot();
	        Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
	        Rectangle rr= new Rectangle(d);
	        File img=new File("C:\\Users\\srilekha\\eclipse-workspace\\seleniumfeb\\src\\test\\resources\\"+name+".png");
	        BufferedImage bf= rb.createScreenCapture(rr);
	        ImageIO.write(bf, "png", img);
		} catch (Exception e) {
			// TODO: handle exception
		}
    	
    	
    	
    }
	public static void main(String[] args) {
		RobotScreenshot.BroswerSetup();
		RobotScreenshot.max();
		RobotScreenshot.urll("https://www.saucedemo.com");
		RobotScreenshot.login();
		RobotScreenshot.rs("Robo");

	}

}
