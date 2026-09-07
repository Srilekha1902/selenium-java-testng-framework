package com.selenium.practice;
//method overloading
public class Discount {
  double price;
  double percentage;
  
  public Discount(double s) {
	  price=s;
  }
  
  public Discount(double n,double m) {
	  price=n;
	  percentage=m;
  }
  
public double calculate(double s) {
	return price;
	
}
public double calculate(double n, double m) {
	return percentage;
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Discount s=new Discount(90.00);
  Discount k=new Discount(100.00,10);
  
  System.out.println(s.price);
  System.out.println(k.percentage);
	}

}
