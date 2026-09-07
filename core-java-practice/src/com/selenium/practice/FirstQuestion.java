package com.selenium.practice;
import java.util.Scanner;
//Write a program that uses Scanner to take number from the users then uses if/else to print whether positive/negative/zero
public class FirstQuestion{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner sc = new Scanner(System.in); {
	System.out.println("Enter the num:");
	 int num=sc.nextInt();
	 System.out.println("The given num is:");
	 if(num>0) {
		 
		 System.out.println("The number is positive");
	}
	 else if(num<0) {
		 System.out.println("The number is negative");
	 }
	 else {
		 System.out.println("The num is zero");
	 }
 }
	}

}
