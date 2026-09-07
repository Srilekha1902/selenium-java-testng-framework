package com.selenium.practice;

public class Student {
	String name;
	int marks;
	
	Student(String n,int m){
		name=n;
		marks=m;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Student h=new Student("Vinay", 100);
  System.out.println(h.name);
  System.out.println(h.marks);
	}

}
