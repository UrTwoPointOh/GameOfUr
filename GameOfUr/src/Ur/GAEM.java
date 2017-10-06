package Ur;

import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GAEM {
	
	static int turns;
	static int playerOneRemainingPieces = 7;
	static int playerTwoRemainingPieces = 7;
	
	static int playerOnePieceOne = 1;
	static int playerOnePieceTwo = 1;
	static int playerOnePieceThree = 1;
	static int playerOnePieceFour = 1;
	static int playerOnePieceFive = 1;
	static int playerOnePieceSix = 1;
	static int playerOnePieceSeven = 1;
	
	static int playerTwoPieceOne = 1;
	static int playerTwoPieceTwo = 1;
	static int playerTwoPieceThree = 1;
	static int playerTwoPieceFour = 1;
	static int playerTwoPieceFive = 1;
	static int playerTwoPieceSix = 1;
	static int playerTwoPieceSeven = 1;
	
	static int playerOnePieceOneSpaceValue;
	static int playerOnePieceTwoSpaceValue;
	static int playerOnePieceThreeSpaceValue;
	static int playerOnePieceFourSpaceValue;
	static int playerOnePieceFiveSpaceValue;
	static int playerOnePieceSixSpaceValue;
	static int playerOnePieceSevenSpaceValue;
	
	static int playerTwoPieceOneSpaceValue = 1;
	static int playerTwoPieceTwoSpaceValue = 1;
	static int playerTwoPieceThreeSpaceValue = 1;
	static int playerTwoPieceFourSpaceValue = 1;
	static int playerTwoPieceFiveSpaceValue = 1;
	static int playerTwoPieceSixSpaceValue = 1;
	static int playerTwoPieceSevenSpaceValue = 1;
	
	static int isPlay = 0;
	static int scorePlayerOne = 0;
	static int scorePlayerTwo = 0;
	static int dieOne;
	static int dieTwo;
	static int dieThree;
	static int dieFour;
	static int totalDie;
	static int instructions;
	
	public static void main(String[] args) throws Exception 
	{ 		
		//The board
		String path = "C:/Game/GameOfUr/Board.jpg";
        File board = new File(path);
        BufferedImage image = ImageIO.read(board);
        JLabel label = new JLabel(new ImageIcon(image));
        JFrame f = new JFrame();
        f.setPreferredSize(new Dimension(950, 600));
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().add(label);
        f.pack();
        f.setLocation(100,50);
        f.setVisible(true);        
        
	}

	public static void gameBoard()
	{
		turns = 1;
		
		if (turns == 1)
		{
			
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
