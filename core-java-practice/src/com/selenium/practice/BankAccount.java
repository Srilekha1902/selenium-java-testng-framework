package com.selenium.practice;
//Encapsulation
public class BankAccount {
 private int balance; //access modifier
 
public BankAccount(int n) {
	balance=n;//constructor
}
public int checkbalance() { //method to check balance
	return balance;
}
public void deposit(int n){ //method to add balance 
	balance=balance+n;
}
public void withdraw(int amount) { //method to withdraw balance
	if(balance<amount) {
		System.out.println("Yo dont have enough balance");
	}
	
	else {
	balance=balance-amount;
	}
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    BankAccount v=new BankAccount(500);
    v.deposit(200);
    v.withdraw(500);
    System.out.println(v.checkbalance());
	}

}
