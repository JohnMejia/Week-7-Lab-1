
import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		Scanner tKeyboard = new Scanner(System.in);
		int i = 0 + (int) (Math.random() * 10);
		int tInput = 0;


		for(int count = 0; count < 3; count++)
		{
			tInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Guess the number I'm thinking of.It's between 1-10"));

			if (tInput == i) {
				JOptionPane.showMessageDialog(null, "You've guessed it!");
			}
			else 
			{
				if (tInput < i )
				{
					JOptionPane.showMessageDialog(null, "Too small.");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Too large.");
				}
			}
		}
		JOptionPane.showMessageDialog(null, "You only get 3 tries!");


	}

}

