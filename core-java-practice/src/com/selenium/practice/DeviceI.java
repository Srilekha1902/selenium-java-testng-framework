package com.selenium.practice;
//single inheritance
public class DeviceI {
	String brandString;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   SmartphoneI v=new SmartphoneI();
		 System.out.println(v.screenSize);
		   System.out.println(v.brand);
	}

}
