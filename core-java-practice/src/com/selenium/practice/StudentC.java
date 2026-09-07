package com.selenium.practice;
//constructors
public class StudentC {
	String name;
	int marks;
	
	
public StudentC()
{     
		name="Unknown";
		marks=0;
		
	}
public StudentC(String n,int m){
	 name=n;
	 marks=m;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  StudentC v=new StudentC("Priya",100);
  StudentC h=new StudentC();
  System.out.println(h.name);
  System.out.println(h.marks);
  System.out.println( v.name);
  System.out.println( v.marks);
  
  
  
	}

}
