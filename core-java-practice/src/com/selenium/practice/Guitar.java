package com.selenium.practice;


 class InstrumentR {
	public void play() {
		System.out.println("Playing an instrument");
	}
 }
	public class Guitar extends InstrumentR{
		@Override
		public void play() {
		System.out.println("Strumming the guitar ");	
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  InstrumentR i=new InstrumentR();
  Guitar g=new Guitar();
  i.play();
  g.play();
  
  
	}

}
