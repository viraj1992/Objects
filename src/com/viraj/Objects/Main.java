package com.viraj.Objects;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Lion myLion = new Lion();
		System.out.println(myLion);
		System.out.println("\nValue of Lion Speed: " + myLion.speed);
		
		myLion.speed = 80;
		System.out.println("\nUpdated Speed of my Lion: " + 80);
		
		Lion mySecondLion = new Lion();
		System.out.println(mySecondLion);
		System.out.println("\nMy second Lion value: " + mySecondLion.speed);
		
		Lion myThirdLion = new Lion();
		System.out.println(myThirdLion);
		myThirdLion.speed = 1000;
		System.out.println("\nMy third Lion value: " + myThirdLion.speed);
		
		

	}

}
