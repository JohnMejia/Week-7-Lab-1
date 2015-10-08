import java.util.Scanner;

import javax.swing.JOptionPane;

public class MainClass {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Guess the number I'm thinking of.It's between 1-10");
		Scanner tKeyboard = new Scanner(System.in);

		int i = 0 + (int) ( Math.random() * 10 );
		int tInput = 10;
		
		do {
			tInput = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter the number I'm thinking of."));

			if (tInput == i) 
			{
				JOptionPane.showMessageDialog(null, "You've guessed it.");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Wrong.");
				if(tInput < i && tInput < 1)
				{
					JOptionPane.showMessageDialog(null, "Too low. Numbers below 1 are not valid. Enter a higher number.");
				}
				else if(tInput > i && tInput > 10)
				{
					JOptionPane.showMessageDialog(null, "Too high. Numbers above 10 are not valid. Enter a lower number.");
				}

			}
		} while (tInput != i);


	}

}