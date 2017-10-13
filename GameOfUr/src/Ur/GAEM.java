 
package Ur;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GAEM extends JPanel{
	
	static int roll=0;
	
	static int turns = 1;

	static int playerTwoPieceOneDone = 0;
	static int playerTwoPieceTwoDone = 0;
	static int playerTwoPieceThreeDone = 0;
	static int playerTwoPieceFourDone = 0;
	static int playerTwoPieceFiveDone = 0;
	static int playerTwoPieceSixDone = 0;
	static int playerTwoPieceSevenDone = 0;
	
	static int playerOnePieceOneDone = 0;
	static int playerOnePieceTwoDone = 0;
	static int playerOnePieceThreeDone = 0;
	static int playerOnePieceFourDone = 0;
	static int playerOnePieceFiveDone = 0;
	static int playerOnePieceSixDone = 0;
	static int playerOnePieceSevenDone = 0;
	
	
	static int playerOnePieceOneSpaceValue = 0;
	static int playerOnePieceTwoSpaceValue = 0;
	static int playerOnePieceThreeSpaceValue = 0;
	static int playerOnePieceFourSpaceValue = 0;
	static int playerOnePieceFiveSpaceValue = 0;
	static int playerOnePieceSixSpaceValue = 0;
	static int playerOnePieceSevenSpaceValue = 0;
	
	static int playerTwoPieceOneSpaceValue = 0;
	static int playerTwoPieceTwoSpaceValue = 0;
	static int playerTwoPieceThreeSpaceValue = 0;
	static int playerTwoPieceFourSpaceValue = 0;
	static int playerTwoPieceFiveSpaceValue = 0;
	static int playerTwoPieceSixSpaceValue = 0;
	static int playerTwoPieceSevenSpaceValue = 0;
	
	
	static int scorePlayerOne = 0;
	static int scorePlayerTwo = 0;
	
	
	static int P1DieOne;
	static int P1DieTwo;
	static int P1DieThree;
	static int P1DieFour;
	static int P1TotalDie;
	
	static int P2DieOne;
	static int P2DieTwo;
	static int P2DieThree;
	static int P2DieFour;
	static int P2TotalDie;
	
	
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
	
	public static void main(String[] args)
	{	
		
		playGame();
	}	

	public static void playGame()
	{		
		// PLAYER ONE
		if (turns == 1)
		{
			P2TotalDie = 0;
			
		String[] options = new String[] {"Piece 7", "Piece 6", "Piece 5", "Piece 4", "Piece 3", "Piece 2", "Piece 1", "Roll", "Exit"};
		int selection;
		
		String turn = "Player One";	
		selection = 10;

		String space1 = "[          ]";
		String space2 = "[          ]";
		String space3 = "[          ]";
		String space4 = "[          ]";
		String space5 = "[          ]";
		String space6 = "[          ]";
		String space7 = "[          ]";
		String space8 = "[          ]";
		String space9 = "[          ]";
		String space10 = "[          ]";
		String space11 = "[          ]";
		String space12 = "[          ]";
		String space13 = "[          ]";
		String space14 = "[          ]";
		String space15 = "[          ]";
		String space16 = "[          ]";
		String space17 = "[          ]";
		String space18 = "[          ]";
		String space19 = "[          ]";
		String space20 = "[          ]";
		
		// Check piece seven space value
		if (playerOnePieceSevenSpaceValue == 1)
		{ space1 = "[P1p1]"; } 
		else if (playerOnePieceSevenSpaceValue == 2)
		{ space2 = "[P1p1]"; }		
		else if (playerOnePieceSevenSpaceValue == 3)
		{ space5 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 4)
		{ space6 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 5)
		{ space7 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 6)
		{ space8 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 7)
		{ space9 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 8)
		{ space10 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 9)
		{ space11 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 10)
		{ space12 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 11)
		{ space13 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 12)
		{ space14 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 13)
		{ space15 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 14)
		{ space16 = "[P1p1]"; }
		if(playerOnePieceSevenSpaceValue > 14)
		{
			playerOnePieceSevenSpaceValue = 0;

			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceSevenDone = 1;
			
			playGame();
		}
		else
		{ }
		
		
		//Check piece six space value
		if (playerOnePieceSixSpaceValue == 1)
		{ space1 = "[P1p2]"; }
		{ space1 = "[          ]"; }
		
		if (playerOnePieceSixSpaceValue == 2)
		{
			space2 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 3)
		{
			space5 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 4)
		{
			space6 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 5)
		{
			space7 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 6)
		{
			space8 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 7)
		{
			space9 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 8)
		{
			space10 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 9)
		{
			space11 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 10)
		{
			space12 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 11)
		{
			space13 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 12)
		{
			space14 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 13)
		{
			space15 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 14)
		{
			space16 = "[P1p2]";
		}
		if(playerOnePieceSixSpaceValue > 14)
		{
			playerOnePieceSixSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceSixDone = 1;
			
			playGame();
		}
		
		//check piece five
		if (playerOnePieceFiveSpaceValue == 1)
		{				
			space1 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 2)
		{
			space2 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 3)
		{
			space5 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 4)
		{
			space6 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 5)
		{
			space7 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 6)
		{
			space8 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 7)
		{
			space9 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 8)
		{
			space10 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 9)
		{
			space11 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 10)
		{
			space12 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 11)
		{
			space13 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 12)
		{

			space14 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 13)
		{
			space15 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 14)
		{
			space16 = "[P1p3]";
		}
		if(playerOnePieceFiveSpaceValue > 14)
		{
			playerOnePieceFiveSpaceValue = 0;
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceFiveDone = 1;
			
			playGame();
		}
		
		//Piece Four
		if (playerOnePieceFourSpaceValue == 1)
		{
			space1 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 2)
		{
			space2 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 3)
		{
			space5 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 4)
		{
			space6 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 5)
		{
			space7 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 6)
		{
			space8 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 7)
		{
			space9 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 8)
		{
			space10 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 9)
		{
			space11 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 10)
		{
			space12 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 11)
		{
			space13 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 12)
		{
			space14 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 13)
		{
			space15 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 14)
		{
			space16 = "[P1p4]";
		}
		if(playerOnePieceFourSpaceValue > 14)
		{
			playerOnePieceFourSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceFourDone = 1;
			
			playGame();
		}
		
		//Piece Three
		if (playerOnePieceThreeSpaceValue == 1)
		{
			space1 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 2)
		{
			space2 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 3)
		{
			space5 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 4)
		{
			space6 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 5)
		{
			space7 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 6)
		{
			space8 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 7)
		{
			space9 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 8)
		{
			space10 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 9)
		{
			space11 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 10)
		{
			space12 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 11)
		{
			space13 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 12)
		{
			space14 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 13)
		{
			space15 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 14)
		{
			space16 = "[P1p5]";
		}
		if(playerOnePieceThreeSpaceValue > 14)
		{
			playerOnePieceThreeSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceThreeDone = 1;
			
			playGame();
		}
		
		//Piece Two
		if (playerOnePieceTwoSpaceValue == 1)
		{
			
			space1 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 2)
		{
			space2 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 3)
		{
			space5 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 4)
		{
			space6 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 5)
		{
			space7 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 6)
		{
			space8 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 7)
		{
			space9 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 8)
		{
			space10 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 9)
		{
			space11 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 10)
		{
			space12 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 11)
		{
			space13 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 12)
		{
			space14 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 13)
		{
			space15 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 14)
		{
			space16 = "[P1p6]";
		}
		if(playerOnePieceTwoSpaceValue > 14)
		{
			playerOnePieceTwoSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceTwoDone = 1;
			
			playGame();
		}
		
		//Piece One
		if (playerOnePieceOneSpaceValue == 1)
		{
			space1 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 2)
		{
			space2 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 3)
		{
			space5 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 4)
		{
			space6 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 5)
		{
			space7 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 6)
		{
			space8 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 7)
		{
			space9 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 8)
		{
			space10 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 9)
		{
			space11 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 10)
		{
			space12 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 11)
		{
			space13 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 12)
		{
			space14 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 13)
		{
			space15 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 14)
		{
			space16 = "[P1p7]";
		}
		if(playerOnePieceOneSpaceValue > 14)
		{
			playerOnePieceOneSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceOneDone = 1;
			
			playGame();
		}
		
		// Draw the Board
		selection = JOptionPane.showOptionDialog(null, "Which piece would you like to move?\n"
				+ space13 + space14 + space15 + space16 + "                         " + space1 + space2 + "\n"
				+ space12 + space11 + space10 + space9 + space8 + space7 + space6 + space5 + "\n"
				+ space17 + space18 + space19 + space20 + "                         " + space3 + space4, turn, JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		
		//Exit the Game
		if (selection == 8)
		{
			System.exit(0);
		}
		
		//Player must roll the dice
		if (selection == 7)
		{
			roll = 1;
			diceRoll();
		}
		
		//Select Piece Seven
		if (selection == 6)
		{
			if (playerOnePieceSevenDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
			playerOnePieceSevenSpaceValue = playerOnePieceSevenSpaceValue + P1TotalDie;
			playGame();
			
			}
			
			if (playerOnePieceSevenDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces");
				playGame();
			}
		}
		
		//Select Piece Six
		if (selection == 5)
		{
			if (playerOnePieceSixDone != 1)
			{
				if (roll == 0)
				{
					JOptionPane.showMessageDialog(null,"Please make a roll");
					playGame();
				}
				playerOnePieceSixSpaceValue = playerOnePieceSixSpaceValue + P1TotalDie;
				playGame();
			
			}
			if (playerOnePieceSixDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playGame();
			}

		}
		
		//Select Piece Five
		if (selection == 4)
		{
			if (playerOnePieceFiveDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
			playerOnePieceFiveSpaceValue = playerOnePieceFiveSpaceValue + P1TotalDie;
			playGame();
			
			}
			if (playerOnePieceFiveDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playGame();
			}

		}
		
		//Select Piece Four
		if (selection == 3)
		{
			if (playerOnePieceFourDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
			playerOnePieceFourSpaceValue = playerOnePieceFourSpaceValue + P1TotalDie;
			playGame();
			
			}
			if (playerOnePieceFourDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playGame();
			}

		}
		
		//Select Piece Three
		if (selection == 2)
		{
			if (playerOnePieceThreeDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
			playerOnePieceThreeSpaceValue = playerOnePieceThreeSpaceValue + P1TotalDie;
			playGame();
			
			}
			if (playerOnePieceThreeDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playGame();
			}

		}
		
		//Select Piece Two
		if (selection == 1)
		{
			if (playerOnePieceTwoDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
			playerOnePieceTwoSpaceValue = playerOnePieceTwoSpaceValue + P1TotalDie;
			playGame();
			
			}
			if (playerOnePieceTwoDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playGame();
			}

		}
		
		//Select Piece One
		if (selection == 0)
		{
			if (playerOnePieceOneDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
			playerOnePieceOneSpaceValue = playerOnePieceOneSpaceValue + P1TotalDie;
			playGame();
			}
			if (playerOnePieceOneDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playGame();
			}

		}
	}
		
		
		//PLAYER TWO
		else
		{
			P1TotalDie = 0;
			
		String[] options = new String[] {"Piece 7", "Piece 6", "Piece 5", "Piece 4", "Piece 3", "Piece 2", "Piece 1", "Roll", "Exit"};
		int selection;
		
		String turn = "Player Two";	
		selection = 10;

		String space1 = "[          ]";
		String space2 = "[          ]";
		String space3 = "[          ]";
		String space4 = "[          ]";
		String space5 = "[          ]";
		String space6 = "[          ]";
		String space7 = "[          ]";
		String space8 = "[          ]";
		String space9 = "[          ]";
		String space10 = "[          ]";
		String space11 = "[          ]";
		String space12 = "[          ]";
		String space13 = "[          ]";
		String space14 = "[          ]";
		String space15 = "[          ]";
		String space16 = "[          ]";
		String space17 = "[          ]";
		String space18 = "[          ]";
		String space19 = "[          ]";
		String space20 = "[          ]";
		
		// Check piece seven space value
		if (playerTwoPieceSevenSpaceValue == 1)
		{ space1 = "[P2p1]"; } 
		else if (playerTwoPieceSevenSpaceValue == 2)
		{ space2 = "[P2p1]"; }		
		else if (playerTwoPieceSevenSpaceValue == 3)
		{ space5 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 4)
		{ space6 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 5)
		{ space7 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 6)
		{ space8 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 7)
		{ space9 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 8)
		{ space10 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 9)
		{ space11 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 10)
		{ space12 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 11)
		{ space13 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 12)
		{ space14 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 13)
		{ space15 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 14)
		{ space16 = "[P2p1]"; }
		if(playerTwoPieceSevenSpaceValue > 14)
		{
			playerTwoPieceSevenSpaceValue = 0;

			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerTwo + " points.");
			playerTwoPieceSevenDone = 1;
			
			playGame();
		}
		else
		{ }
		
		
		//Check piece six space value
		if (playerTwoPieceSixSpaceValue == 1)
		{ space1 = "[P2p2]"; }
		{ space1 = "[          ]"; }
		
		if (playerTwoPieceSixSpaceValue == 2)
		{
			space2 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 3)
		{
			space5 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 4)
		{
			space6 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 5)
		{
			space7 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 6)
		{
			space8 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 7)
		{
			space9 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 8)
		{
			space10 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 9)
		{
			space11 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 10)
		{
			space12 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 11)
		{
			space13 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 12)
		{
			space14 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 13)
		{
			space15 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 14)
		{
			space16 = "[P2p2]";
		}
		if(playerTwoPieceSixSpaceValue > 14)
		{
			playerTwoPieceSixSpaceValue = 0;
			
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerTwo + " points.");
			playerTwoPieceSixDone = 1;
			
			playGame();
		}
		
		//check piece five
		if (playerTwoPieceFiveSpaceValue == 1)
		{				
			space1 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 2)
		{
			space2 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 3)
		{
			space5 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 4)
		{
			space6 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 5)
		{
			space7 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 6)
		{
			space8 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 7)
		{
			space9 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 8)
		{
			space10 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 9)
		{
			space11 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 10)
		{
			space12 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 11)
		{
			space13 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 12)
		{

			space14 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 13)
		{
			space15 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 14)
		{
			space16 = "[P2p3]";
		}
		if(playerTwoPieceFiveSpaceValue > 14)
		{
			playerTwoPieceFiveSpaceValue = 0;
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerTwo + " points.");
			playerTwoPieceFiveDone = 1;
			
			playGame();
		}
		
		//Piece Four
		if (playerTwoPieceFourSpaceValue == 1)
		{
			space1 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 2)
		{
			space2 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 3)
		{
			space5 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 4)
		{
			space6 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 5)
		{
			space7 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 6)
		{
			space8 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 7)
		{
			space9 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 8)
		{
			space10 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 9)
		{
			space11 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 10)
		{
			space12 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 11)
		{
			space13 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 12)
		{
			space14 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 13)
		{
			space15 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 14)
		{
			space16 = "[P2p4]";
		}
		if(playerTwoPieceFourSpaceValue > 14)
		{
			playerTwoPieceFourSpaceValue = 0;
			
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerTwo + " points.");
			playerTwoPieceFourDone = 1;
			
			playGame();
		}
		
		///Start Here
		//Start here
		//Start HeRe
		
		//Piece Three
		if (playerOnePieceThreeSpaceValue == 1)
		{
			space1 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 2)
		{
			space2 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 3)
		{
			space5 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 4)
		{
			space6 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 5)
		{
			space7 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 6)
		{
			space8 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 7)
		{
			space9 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 8)
		{
			space10 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 9)
		{
			space11 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 10)
		{
			space12 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 11)
		{
			space13 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 12)
		{
			space14 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 13)
		{
			space15 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 14)
		{
			space16 = "[P1p5]";
		}
		if(playerOnePieceThreeSpaceValue > 14)
		{
			playerOnePieceThreeSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceThreeDone = 1;
			
			playGame();
		}
		
		//Piece Two
		if (playerOnePieceTwoSpaceValue == 1)
		{
			
			space1 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 2)
		{
			space2 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 3)
		{
			space5 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 4)
		{
			space6 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 5)
		{
			space7 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 6)
		{
			space8 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 7)
		{
			space9 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 8)
		{
			space10 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 9)
		{
			space11 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 10)
		{
			space12 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 11)
		{
			space13 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 12)
		{
			space14 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 13)
		{
			space15 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 14)
		{
			space16 = "[P1p6]";
		}
		if(playerOnePieceTwoSpaceValue > 14)
		{
			playerOnePieceTwoSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceTwoDone = 1;
			
			playGame();
		}
		
		//Piece One
		if (playerOnePieceOneSpaceValue == 1)
		{
			space1 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 2)
		{
			space2 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 3)
		{
			space5 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 4)
		{
			space6 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 5)
		{
			space7 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 6)
		{
			space8 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 7)
		{
			space9 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 8)
		{
			space10 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 9)
		{
			space11 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 10)
		{
			space12 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 11)
		{
			space13 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 12)
		{
			space14 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 13)
		{
			space15 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 14)
		{
			space16 = "[P1p7]";
		}
		if(playerOnePieceOneSpaceValue > 14)
		{
			playerOnePieceOneSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceOneDone = 1;
			
			playGame();
		}
		
		// Draw the Board
		selection = JOptionPane.showOptionDialog(null, "Which piece would you like to move?\n"
				+ space13 + space14 + space15 + space16 + "                         " + space1 + space2 + "\n"
				+ space12 + space11 + space10 + space9 + space8 + space7 + space6 + space5 + "\n"
				+ space17 + space18 + space19 + space20 + "                         " + space3 + space4, turn, JOptionPane.DEFAULT_OPTION,
				JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
		
		//Exit the Game
		if (selection == 8)
		{
			System.exit(0);
		}
		
		//Player must roll the dice
		if (selection == 7)
		{
			roll = 1;
			diceRoll();
		}
		
		//Select Piece Seven
		if (selection == 6)
		{
			if (playerOnePieceSevenDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
			playerOnePieceSevenSpaceValue = playerOnePieceSevenSpaceValue + P1TotalDie;
			playGame();
			
			}
			
			if (playerOnePieceSevenDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces");
				playGame();
			}
		}
		
		//Select Piece Six
		if (selection == 5)
		{
			if (playerOnePieceSixDone != 1)
			{
				if (roll == 0)
				{
					JOptionPane.showMessageDialog(null,"Please make a roll");
					playGame();
				}
				playerOnePieceSixSpaceValue = playerOnePieceSixSpaceValue + P1TotalDie;
				playGame();
			
			}
			if (playerOnePieceSixDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playGame();
			}

		}
		
		//Select Piece Five
		if (selection == 4)
		{
			if (playerOnePieceFiveDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
			playerOnePieceFiveSpaceValue = playerOnePieceFiveSpaceValue + P1TotalDie;
			playGame();
			
			}
			if (playerOnePieceFiveDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playGame();
			}

		}
		
		//Select Piece Four
		if (selection == 3)
		{
			if (playerOnePieceFourDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
			playerOnePieceFourSpaceValue = playerOnePieceFourSpaceValue + P1TotalDie;
			playGame();
			
			}
			if (playerOnePieceFourDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playGame();
			}

		}
		
		//Select Piece Three
		if (selection == 2)
		{
			if (playerOnePieceThreeDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
			playerOnePieceThreeSpaceValue = playerOnePieceThreeSpaceValue + P1TotalDie;
			playGame();
			
			}
			if (playerOnePieceThreeDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playGame();
			}

		}
		
		//Select Piece Two
		if (selection == 1)
		{
			if (playerOnePieceTwoDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
			playerOnePieceTwoSpaceValue = playerOnePieceTwoSpaceValue + P1TotalDie;
			playGame();
			
			}
			if (playerOnePieceTwoDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playGame();
			}

		}
		
		//Select Piece One
		if (selection == 0)
		{
			if (playerOnePieceOneDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playGame();
			}
			playerOnePieceOneSpaceValue = playerOnePieceOneSpaceValue + P1TotalDie;
			playGame();
			}
			if (playerOnePieceOneDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playGame();
			}

		}
		}
	}
	
	public static void diceRoll()
	{		
		if (turns == 1)
		{
		P1DieOne = 0 + (int)(Math.random() * ((1 - 0) + 1));
		P1DieTwo = 0 + (int)(Math.random() * ((1 - 0) + 1));
		P1DieThree = 0 + (int)(Math.random() * ((1 - 0) + 1));
		P1DieFour = 0 + (int)(Math.random() * ((1 - 0) + 1));
		
		P1TotalDie = P1DieOne + P1DieTwo + P1DieThree + P1DieFour;
		
		JOptionPane.showMessageDialog(null, P1TotalDie);	
		
		playGame();
		}
		else
		{
			P2DieOne = 0 + (int)(Math.random() * ((1 - 0) + 1));
			P2DieTwo = 0 + (int)(Math.random() * ((1 - 0) + 1));
			P2DieThree = 0 + (int)(Math.random() * ((1 - 0) + 1));
			P2DieFour = 0 + (int)(Math.random() * ((1 - 0) + 1));
			
			P2TotalDie = P2DieOne + P2DieTwo + P2DieThree + P2DieFour;
			
			JOptionPane.showMessageDialog(null, P1TotalDie);	
			
			playGame();
		}
	}

}


