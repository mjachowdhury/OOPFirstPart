package week2Lab2;

import java.util.Scanner;

public class BottleSong {

	public static void main(String[] args) {
		 
		int numberOfBottles = 99;
		String word = "bottle";
		
		while(numberOfBottles > 0){
			System.out.println(numberOfBottles + " " + word + " of juice on the wall" );
			//System.out.println(numberOfBottles + " " + word + " of juice" );
			System.out.println("Take one down.");
			System.out.println("Pass it around.");
			
			numberOfBottles =numberOfBottles - 1;
		}
		if(numberOfBottles == 1){
			word = "bottle";//one bottle
		}
		/*if(numberOfBottles > 0){
			System.out.println(numberOfBottles +" " + word + "of juice on the wall.");
			System.out.println("======================================");			
		}*/
		else {
			System.out.println("No more bottles of juice left on the wall.");
		}
	}

}
