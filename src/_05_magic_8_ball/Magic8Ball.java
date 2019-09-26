//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0


package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class Magic8Ball {
public static void main(String[] args) {
	

	// 1. Make a main method that includes all the steps below….

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
Random joe= new Random();
	// 3. Print out this variable
System.out.println(joe);
	// 4. Get the user to enter a question for the 8 ball
JOptionPane.showInputDialog(null, "ask me a question for I know all and tell all");
	// 5. If the random number is 0
int randomNumber = joe.nextInt(4);
	// -- tell the user "Yes"
if (randomNumber==0) {
JOptionPane.showMessageDialog(null, "yes");
}
	// 6. If the random number is 1
if (randomNumber==1) {
JOptionPane.showMessageDialog(null, "no");
}
	// -- tell the user "No"

	// 7. If the random number is 2
if (randomNumber==2) {
JOptionPane.showMessageDialog(null, "ooohhhhh, thats a tough one. ask google for google knows even more than me and tells even more than me");
}
	// -- tell the user "Maybe you should ask Google?"

	// 8. If the random number is 3
if (randomNumber==3) {
JOptionPane.showMessageDialog(null, "you are so hopeless that you are asking a computer program made to only pick a random number and answer your stupid question with a predetermind answer ");
}
	// -- write your own answer
}
}
