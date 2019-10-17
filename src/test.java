import java.util.Random;

import javax.swing.JOptionPane;

public class test {
	public static void main(String[] args) {
		//The user is going to make some cookies.
		//On paper, write code that does the following:
		//1. Ask the user how many cups of flour they have. If they have less than 2 cups, tell
		//them to go to the store to buy more.
		String dope=JOptionPane.showInputDialog(null, "you will make some cookies. How many coup of flour do you have?");
		int dop=Integer.parseInt(dope);
		if (dop < 3) {
			JOptionPane.showMessageDialog(null, "you dont have enough. buy more. waste money.");
		} 
		
String bo=JOptionPane.showInputDialog(null, "how many people do you want to give these cookies to?");
		
		int b=Integer.parseInt(bo);
		
		if (b>30) {
			JOptionPane.showMessageDialog(null, "you have so many friends! bake 2 batches. Waste more money");
		

		}
String db=JOptionPane.showInputDialog(null, "how many batches do you make?");
		
		int f=Integer.parseInt(db);
		
		if (f>1) {
			JOptionPane.showMessageDialog(null, "you have too many friends. get rid of some.");
		

		}
		//2. Now ask them how many people they are going to give cookies to. If they are going
		//to give cookies to more than 30 people, tell them they are going to have to bake two
		//batches of cookies! 
		//3. Finally, ask them how many batches of cookies they baked. If they baked 2 batches
		//of cookies, tell them they are lucky to have so many friends. 
	
	
	
	}
	
}
