//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

package _04_validation;

import java.util.Random;

import javax.swing.JOptionPane;

public class Validation {
	public static void main(String[] args) {
		
		Random randomMaker = new Random();
		
		int randomNumber = randomMaker.nextInt(6);
		
		

		// 1. Use each value of randomNumber to give the user a random compliment.
if (randomNumber==1) {
	System.out.println("moron");
}
if (randomNumber==2) {
	System.out.println("nincompoop");
}
if (randomNumber==3) {
	System.out.println("loser");
}
if (randomNumber==4) {
	System.out.println("i hate you");
}
if (randomNumber==5) {
	System.out.println("get lost");
}
if (randomNumber==0) {
	System.out.println("dummy");
}
		// 2. Repeat all the code above 10 times
		
		// 3. Find someone to test out your program. They will like it :)
	}
}
