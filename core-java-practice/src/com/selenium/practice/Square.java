package com.selenium.practice;

class ShapeR{
public void area() {
	System.out.println("Area not defined")
	;
}
}
 

public class Square extends ShapeR {
	
	public void area() {
		// TODO Auto-generated method stub
		System.out.println("Area=side*side");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeR v=new ShapeR(); 
Square h=new Square();
h.area();
v.area();

	}

}
