package com.selenium.practice;

public class LaptopC {
	String brand;
	
	public LaptopC() {
		brand="Unknown";
		System.out.println("Laptop created wth no brand set:");

	
	}
	public LaptopC(String n) {
		brand=n;
		System.out.println("Laptop created:" + brand);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  LaptopC h=new LaptopC();
  System.out.println(h.brand);
  LaptopC v=new LaptopC("Dell");
  System.out.println(v.brand);
	}

}
