package Ur;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import sun.audio.AudioData;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;
import sun.audio.ContinuousAudioDataStream;

import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import javax.swing.*;


public class GAEM extends JPanel{
	
	static int roll=0;
	
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
	
	static String space1 = "[          ]";
	static String space2 = "[          ]";
	static String space3 = "[          ]";
	static String space4 = "[          ]";
	static String space5 = "[          ]";
	static String space6 = "[          ]";
	static String space7 = "[          ]";
	static String space8 = "[          ]";
	static String space9 = "[          ]";
	static String space10 = "[          ]";
	static String space11 = "[          ]";
	static String space12 = "[          ]";
	static String space13 = "[          ]";
	static String space14 = "[          ]";
	static String space15 = "[          ]";
	static String space16 = "[          ]";
	static String space17 = "[          ]";
	static String space18 = "[          ]";
	static String space19 = "[          ]";
	static String space20 = "[          ]";
	
	

	static void Instructions()
	{
		JOptionPane.showMessageDialog(null, "1.Player 1 will go first ( red )\r\n" + 
				"Player 2 will go second ( blue )\r\n" + 
				"2. Roll to move your pieces\r\n" + 
				"3. You may place a piece or move an existing piece\r\n" + 
				"4. Click the number signifying your piece count to place a new piece\r\n" + 
				"5. Click an existing piece to move it\r\n" + 
				"6. You are in the Safe Zone when on your side of the board\r\n" + 
				"7. The middle side of the board is the War Zone\r\n" + 
				"8. You may not enter your opponent’s Safe Zone\r\n" + 
				"9. Landing on your opponent’s piece when in the War Zone will remove their piece and send it back into their hand.\r\n" + 
				"10. If your piece is on the Crest and your opponent lands on it, as well, the opponent cannot  remove your piece, and instead will be placed in the space behind it.\r\n" + 
				"11. To win the game, your pieces must make it from the start to the finish, then off of the board.\r\n" + 
				"12. A piece cannot be moved from finish space to off of the board in the same turn.\r\n" + 
				"13. To move off the board from the finish space, a piece must only be able to move one space; no more\r\n" + 
				"14. When rolling, 4 rolls are made, all either granting 1 or 0\r\n" + 
				"15. Amount granted is added and the total is the amount of spaces you may move in that turn \r\n" 
				);
	}
	static void Music() 
	{
	
	
		 try {
			 ContinuousAudioDataStream loop = null;
		        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("C:\\Users\\hs131455\\Downloads\\Main.wav").getAbsoluteFile());
		        Clip clip = AudioSystem.getClip();
		        clip.open(audioInputStream);
		        clip.start();
		    } catch(Exception ex) {
		        System.out.println("Error with playing sound.");
		        ex.printStackTrace();
		    }
	
	}
	
	
	public static void main(String[] args) throws Exception
	
	{	
		Music();
		Instructions();
		playGame();
	}
	
	
		

	
	public static void playGame()
	{
		String[] options = new String[] {"Piece 1", "Piece 2", "Piece 3", "Piece 4", "Piece 5", "Piece 6", "Piece 7", "Roll"};
		int selection;
		
		String turn = "Player One";	
		selection = 10;
		selection = JOptionPane.showOptionDialog(null, "Which piece would you like to move?\n"
				+ space13 + space14 + space15 + space16 + "                         " + space1 + space2 + "\n"
				+ space12 + space11 + space10 + space9 + space8 + space7 + space6 + space5 + "\n"
				+ space17 + space18 + space19 + space20 + "                         " + space3 + space4, turn, JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		if (selection == 7)
		{
			roll = 1;
			diceRoll();
		}
		else if (selection == 6)
		{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
		}
		else if (selection == 5)
		{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
		}
		else if (selection == 4)
		{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
		}
		else if (selection == 3)
		{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
		}
		else if (selection == 2)
		{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
		}
		else if (selection == 1)
		{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
		}
		else if (selection == 0)
		{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
		}
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
		
		playGame();
	}

}
