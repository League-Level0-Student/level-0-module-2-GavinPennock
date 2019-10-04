package _05_magic_8_ball;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {
	public static void main(String[] args) {
		
	
String jerry=JOptionPane.showInputDialog(null, "put in five numbers inbetween 1 and 10 so that you can enter the lottery");
	
Random answer=new Random();
int answer1= answer.nextInt(11);
int answer2= answer.nextInt(11);
int answer3= answer.nextInt(11);
int answer4= answer.nextInt(11);
int answer5= answer.nextInt(11);

	JOptionPane.showMessageDialog(null,answer1 + "  " +answer2+""+answer3+""+answer4+""+answer5);
	
	
	}
}
