package com.selenium.practice;
//constructor
public class Car {
  String color;
  int speed;
  
 
 Car(String c,int s ){
  color=c;
  speed=s;
 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Car b=new Car("red",100);
 System.out.println(b.color);
 System.out.println(b.speed);
	}

}
