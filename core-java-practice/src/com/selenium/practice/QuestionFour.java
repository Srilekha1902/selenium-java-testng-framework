package com.selenium.practice;

import java.util.Scanner;
//using a while loop that takes number from user and prints all nums from 1 up to that number
//,but skip printing the number 5(use continue)
public class QuestionFour{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the num:");
		int num=sc.nextInt();
		int i=1;
		while(i<=num) {
			if(i==5) {
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}

	}

}
