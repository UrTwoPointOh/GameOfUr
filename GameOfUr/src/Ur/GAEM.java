package Ur;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class GAEM {
	
	static int turns;
	static int playerOneCurrentPieces = 7;
	static int playerTwoCurrentPieces = 7;
	static int[] playerOnePieces = new int[7];
	static int[] playerTwoPieces = new int[7];
	static int spaceValue;
	static int isPlay = 0;
	static int[] scorePlayerOne = new int[2];
	static int[] scorePlayerTwo = new int[2];
	static int dieOne;
	static int dieTwo;
	static int dieThree;
	static int dieFour;
	static int totalDie;
	static int instructions;
	
	public static void main(String[] args) 
	{
		JFrame frame = new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		gameBoard();
	}
	
	public static void gameBoard()
	{
		turns = 1;
		
		if (turns == 1)
		{
			diceRoll();
		}
		else if (turns == 2)
		{
			
		}
	}
	
	public static void diceRoll()
	{		
		dieOne = 0 + (int)(Math.random() * ((1 - 0) + 1));
		dieTwo = 0 + (int)(Math.random() * ((1 - 0) + 1));
		dieThree = 0 + (int)(Math.random() * ((1 - 0) + 1));
		dieFour = 0 + (int)(Math.random() * ((1 - 0) + 1));
		
		totalDie = dieOne + dieTwo + dieThree + dieFour;
		
		JOptionPane.showMessageDialog(null, totalDie);		
	}

}
