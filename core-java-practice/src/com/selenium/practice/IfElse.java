package com.selenium.practice;

public class IfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=20;
		
		if(marks>=90) {
			System.out.println("congrats you got A");
		}
		else if(marks>=70)
		{
			System.out.println("congrats you got B");
		}
		else if(marks>=65)
		{
			System.out.println("You have scored C");
		}
		else {
			System.out.println("D");
		}
		
		boolean isRegistered=true;
				if(isRegistered)
				{
					System.out.println("Welcome Back");
				}
				else {
					System.out.println("Register first");
				}

	}

}
