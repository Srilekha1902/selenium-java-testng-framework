package com.selenium.practice;
import java.util.Scanner;
//To write a program using a switch statement that takes number from user 1-12 and to print months accordingly.
public class SecondQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter the number:");
  int num=sc.nextInt();
  System.out.println("Season:");
  switch(num){
  case 12:
  case 1:
  case 2:
  {
	  System.out.println("Winter");
  }
  break;
  case 3:
  case 4:
  case 5:
  {
	  System.out.println("Summer");
  }
  break;
  case 6:
  case 7:
  case 8:
  {
	  System.out.println("Monsoon");
  }
  break;
  case 9:
  case 10:
  case 11:
  {
	  System.out.println("Autumn");
  }
  break;
  }
	}

}
