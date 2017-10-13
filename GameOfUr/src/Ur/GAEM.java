package Ur;

import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
	
	
	public void setVisible(boolean b) {
		// TODO Auto-generated method stub
		
	}
	
	
	public static void main(String[] args) throws Exception
	
	{	
		
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
