 
package Ur;

import javax.swing.JOptionPane;

public class GAEM{
	
	static int roll=0;

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
	static String p1space13 = "[          ]";
	static String p1space14 = "[          ]";
	static String p1space15 = "[          ]";
	static String p1space16 = "[          ]";
	static String p2space13 = "[          ]";
	static String p2space14 = "[          ]";
	static String p2space15 = "[          ]";
	static String p2space16 = "[          ]";
	
	public static void main(String[] args)
	{	
		
		playerOne();
	}	

	public static void playerOne()
	{		
		// PLAYER ONE
		{
			P2TotalDie = 0;
			
		String[] options = new String[] {"Piece 7", "Piece 6", "Piece 5", "Piece 4", "Piece 3", "Piece 2", "Piece 1", "Roll", "Exit"};
		int selection;
		
		String turn = "Player One";	
		selection = 10;

		space1 = "[          ]";
		space2 = "[          ]";
		space3 = "[          ]";
		space4 = "[          ]";
		space5 = "[          ]";
		space6 = "[          ]";
		space7 = "[          ]";
		space8 = "[          ]";
		space9 = "[          ]";
		space10 = "[          ]";
		space11 = "[          ]";
		space12 = "[          ]";
		p1space13 = "[          ]";
		p1space14 = "[          ]";
		p1space15 = "[          ]";
		p1space16 = "[          ]";
		p2space13 = "[          ]";
		p2space14 = "[          ]";
		p2space15 = "[          ]";
		p2space16 = "[          ]";
		
		
		
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
		{ p1space13 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 12)
		{ p1space14 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 13)
		{ p1space15 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 14)
		{ p1space16 = "[P1p1]"; }
		if(playerOnePieceSevenSpaceValue > 14)
		{
			playerOnePieceSevenSpaceValue = 0;

			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceSevenDone = 1;
			
			playerTwo();
		}
		else
		{ }
		
		
		//Check piece six space value
		if (playerOnePieceSixSpaceValue == 1)
		{ space1 = "[P1p2]"; }
		
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
			p1space13 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 12)
		{
			p1space14 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 13)
		{
			p1space15 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 14)
		{
			p1space16 = "[P1p2]";
		}
		if(playerOnePieceSixSpaceValue > 14)
		{
			playerOnePieceSixSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceSixDone = 1;
			
			playerTwo();
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
			p1space13 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 12)
		{

			p1space14 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 13)
		{
			p1space15 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 14)
		{
			p1space16 = "[P1p3]";
		}
		if(playerOnePieceFiveSpaceValue > 14)
		{
			playerOnePieceFiveSpaceValue = 0;
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceFiveDone = 1;
			
			playerTwo();
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
			p1space13 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 12)
		{
			p1space14 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 13)
		{
			p1space15 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 14)
		{
			p1space16 = "[P1p4]";
		}
		if(playerOnePieceFourSpaceValue > 14)
		{
			playerOnePieceFourSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceFourDone = 1;
			
			playerTwo();
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
			p1space13 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 12)
		{
			p1space14 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 13)
		{
			p1space15 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 14)
		{
			p1space16 = "[P1p5]";
		}
		if(playerOnePieceThreeSpaceValue > 14)
		{
			playerOnePieceThreeSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceThreeDone = 1;
			
			playerTwo();
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
			p1space13 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 12)
		{
			p1space14 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 13)
		{
			p1space15 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 14)
		{
			p1space16 = "[P1p6]";
		}
		if(playerOnePieceTwoSpaceValue > 14)
		{
			playerOnePieceTwoSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceTwoDone = 1;
			
			playerTwo();
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
			p1space13 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 12)
		{
			p1space14 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 13)
		{
			p1space15 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 14)
		{
			p1space16 = "[P1p7]";
		}
		if(playerOnePieceOneSpaceValue > 14)
		{
			playerOnePieceOneSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceOneDone = 1;
			
			playerTwo();
		}
		
		//Check player two space values
		// Check piece seven space value
		// Check piece seven space value
		if (playerTwoPieceSevenSpaceValue == 1)
		{ space3 = "[P2p1]"; } 
		else if (playerTwoPieceSevenSpaceValue == 2)
		{ space4 = "[P2p1]"; }		
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
		{ p2space13 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 12)
		{ p2space14 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 13)
		{ p2space15 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 14)
		{ p2space16 = "[P2p1]"; }
		if(playerTwoPieceSevenSpaceValue > 14)
		{
			playerTwoPieceSevenSpaceValue = 0;

			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceSevenDone = 1;
			
			playerOne();
		}
		else
		{ }
		
		
		//Check piece six space value
		if (playerTwoPieceSixSpaceValue == 1)
		{ space3 = "[P2p2]"; }
		
		if (playerTwoPieceSixSpaceValue == 2)
		{
			space4 = "[P2p2]";
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
			p2space13 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 12)
		{
			p2space14 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 13)
		{
			p2space15 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 14)
		{
			p2space16 = "[P2p2]";
		}
		if(playerTwoPieceSixSpaceValue > 14)
		{
			playerTwoPieceSixSpaceValue = 0;
			
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceSixDone = 1;
			
			playerOne();
		}
		
		//check piece five
		if (playerTwoPieceFiveSpaceValue == 1)
		{				
			space3 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 2)
		{
			space4 = "[P2p3]";
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
			p2space13 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 12)
		{

			p2space14 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 13)
		{
			p2space15 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 14)
		{
			p2space16 = "[P2p3]";
		}
		if(playerTwoPieceFiveSpaceValue > 14)
		{
			playerTwoPieceFiveSpaceValue = 0;
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceFiveDone = 1;
			
			playerOne();
		}
		
		//Piece Four
		if (playerTwoPieceFourSpaceValue == 1)
		{
			space3 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 2)
		{
			space4 = "[P2p4]";
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
			p2space13 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 12)
		{
			p2space14 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 13)
		{
			p2space15 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 14)
		{
			p2space16 = "[P2p4]";
		}
		if(playerTwoPieceFourSpaceValue > 14)
		{
			playerTwoPieceFourSpaceValue = 0;
			
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceFourDone = 1;
			
			playerOne();
		}
		
		//Piece Three
		if (playerTwoPieceThreeSpaceValue == 1)
		{
			space3 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 2)
		{
			space4 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 3)
		{
			space5 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 4)
		{
			space6 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 5)
		{
			space7 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 6)
		{
			space8 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 7)
		{
			space9 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 8)
		{
			space10 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 9)
		{
			space11 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 10)
		{
			space12 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 11)
		{
			p2space13 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 12)
		{
			p2space14 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 13)
		{
			p2space15 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 14)
		{
			p2space16 = "[P2p5]";
		}
		if(playerTwoPieceThreeSpaceValue > 14)
		{
			playerTwoPieceThreeSpaceValue = 0;
			
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceThreeDone = 1;
			
			playerOne();
		}
		
		//Piece Two
		if (playerTwoPieceTwoSpaceValue == 1)
		{			
			space3 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 2)
		{
			space4 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 3)
		{
			space5 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 4)
		{
			space6 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 5)
		{
			space7 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 6)
		{
			space8 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 7)
		{
			space9 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 8)
		{
			space10 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 9)
		{
			space11 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 10)
		{
			space12 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 11)
		{
			p2space13 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 12)
		{
			p2space14 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 13)
		{
			p2space15 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 14)
		{
			p2space16 = "[P2p6]";
		}
		if(playerTwoPieceTwoSpaceValue > 14)
		{
			playerTwoPieceTwoSpaceValue = 0;
			
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceTwoDone = 1;
			
			playerOne();
		}
		
		//Piece One
		if (playerTwoPieceOneSpaceValue == 1)
		{
			space3 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 2)
		{
			space4 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 3)
		{
			space5 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 4)
		{
			space6 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 5)
		{
			space7 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 6)
		{
			space8 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 7)
		{
			space9 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 8)
		{
			space10 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 9)
		{
			space11 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 10)
		{
			space12 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 11)
		{
			p2space13 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 12)
		{
			p2space14 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 13)
		{
			p2space15 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 14)
		{
			p2space16 = "[P2p7]";
		}
		if(playerTwoPieceOneSpaceValue > 14)
		{
			playerTwoPieceOneSpaceValue = 0;
			
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceOneDone = 1;
			
			playerOne();
		}
		
		// Draw the Board
		selection = JOptionPane.showOptionDialog(null, "Which piece would you like to move?\n"
				+ p1space13 + p1space14 + p1space15 + p1space16 + "                         " + space1 + space2 + "\n"
				+ space12 + space11 + space10 + space9 + space8 + space7 + space6 + space5 + "\n"
				+ p2space13 + p2space14 + p2space15 + p2space16 + "                         " + space3 + space4, turn, JOptionPane.DEFAULT_OPTION,
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
			diceRollPlayerOne();
		}
		
		//Select Piece Seven
		if (selection == 6)
		{
			if (playerOnePieceSevenDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playerOne();
			}
			playerOnePieceSevenSpaceValue = playerOnePieceSevenSpaceValue + P1TotalDie;
			
			//check if pieces landed on pieces
 
			if (playerOnePieceSevenSpaceValue < 3 || playerOnePieceSevenSpaceValue > 10)
			{
				if (playerOnePieceSevenSpaceValue == playerOnePieceSixSpaceValue)
				{
					playerOnePieceSixSpaceValue = 0;
				}
				else if (playerOnePieceSevenSpaceValue == playerOnePieceFiveSpaceValue)
				{
					playerOnePieceFiveSpaceValue = 0;
				}
				else if (playerOnePieceSevenSpaceValue == playerOnePieceFourSpaceValue)
				{
					playerOnePieceFourSpaceValue = 0;
				}
				else if (playerOnePieceSevenSpaceValue == playerOnePieceThreeSpaceValue)
				{
					playerOnePieceThreeSpaceValue = 0;
				}
				else if (playerOnePieceSevenSpaceValue == playerOnePieceTwoSpaceValue)
				{
					playerOnePieceTwoSpaceValue = 0;
				}
				else if (playerOnePieceSevenSpaceValue == playerOnePieceOneSpaceValue)
				{
					playerOnePieceOneSpaceValue = 0;
				}
				else
				{
					
				}
				
				playerTwo();
			}
			
			if (playerOnePieceSevenSpaceValue == playerTwoPieceSevenSpaceValue)
			{
				playerTwoPieceSevenSpaceValue = 0;
			}
			else if (playerOnePieceSevenSpaceValue == playerTwoPieceSixSpaceValue)
			{
				playerTwoPieceSixSpaceValue = 0;
			}
			else if (playerOnePieceSevenSpaceValue == playerTwoPieceFiveSpaceValue)
			{
				playerTwoPieceFiveSpaceValue = 0;
			}
			else if (playerOnePieceSevenSpaceValue == playerTwoPieceFourSpaceValue)
			{
				playerTwoPieceFourSpaceValue = 0;
			}
			else if (playerOnePieceSevenSpaceValue == playerTwoPieceThreeSpaceValue)
			{
				playerTwoPieceThreeSpaceValue = 0;
			}
			else if (playerOnePieceSevenSpaceValue == playerTwoPieceTwoSpaceValue)
			{
				playerTwoPieceTwoSpaceValue = 0;
			}
			else if (playerOnePieceSevenSpaceValue == playerTwoPieceOneSpaceValue)
			{
				playerTwoPieceOneSpaceValue = 0;
			}
			
			//Own Piece landed on with piece seven

			else if (playerOnePieceSevenSpaceValue == playerOnePieceSixSpaceValue)
			{
				playerOnePieceSixSpaceValue = 0;
			}
			else if (playerOnePieceSevenSpaceValue == playerOnePieceFiveSpaceValue)
			{
				playerOnePieceFiveSpaceValue = 0;
			}
			else if (playerOnePieceSevenSpaceValue == playerOnePieceFourSpaceValue)
			{
				playerOnePieceFourSpaceValue = 0;
			}
			else if (playerOnePieceSevenSpaceValue == playerOnePieceThreeSpaceValue)
			{
				playerOnePieceThreeSpaceValue = 0;
			}
			else if (playerOnePieceSevenSpaceValue == playerOnePieceTwoSpaceValue)
			{
				playerOnePieceTwoSpaceValue = 0;
			}
			else if (playerOnePieceSevenSpaceValue == playerOnePieceOneSpaceValue)
			{
				playerOnePieceOneSpaceValue = 0;
			}
			else
			{
				
			}
			
			playerTwo();
			
			}
			
			if (playerOnePieceSevenDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces");
				playerOne();
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
					playerOne();
				}
				playerOnePieceSixSpaceValue = playerOnePieceSixSpaceValue + P1TotalDie;
				
				
				// Check if land on piece
				//Player Two landed on
				
				if (playerOnePieceSixSpaceValue < 3 || playerOnePieceSixSpaceValue > 10)
				{
					if (playerOnePieceSixSpaceValue == playerOnePieceSevenSpaceValue)
					{
						playerOnePieceSevenSpaceValue = 0;
					}
					else if (playerOnePieceSixSpaceValue == playerOnePieceFiveSpaceValue)
					{
						playerOnePieceFiveSpaceValue = 0;
					}
					else if (playerOnePieceSixSpaceValue == playerOnePieceFourSpaceValue)
					{
						playerOnePieceFourSpaceValue = 0;
					}
					else if (playerOnePieceSixSpaceValue == playerOnePieceThreeSpaceValue)
					{
						playerOnePieceThreeSpaceValue = 0;
					}
					else if (playerOnePieceSixSpaceValue == playerOnePieceTwoSpaceValue)
					{
						playerOnePieceTwoSpaceValue = 0;
					}
					else if (playerOnePieceSixSpaceValue == playerOnePieceOneSpaceValue)
					{
						playerOnePieceOneSpaceValue = 0;
					}
					
					playerTwo();
				}
				
				if (playerOnePieceSixSpaceValue == playerTwoPieceSevenSpaceValue)
				{
					playerTwoPieceSevenSpaceValue = 0;
				}
				else if (playerOnePieceSixSpaceValue == playerTwoPieceSixSpaceValue)
				{
					playerTwoPieceSixSpaceValue = 0;
				}
				else if (playerOnePieceSixSpaceValue == playerTwoPieceFiveSpaceValue)
				{
					playerTwoPieceFiveSpaceValue = 0;
				}
				else if (playerOnePieceSixSpaceValue == playerTwoPieceFourSpaceValue)
				{
					playerTwoPieceFourSpaceValue = 0;
				}
				else if (playerOnePieceSixSpaceValue == playerTwoPieceThreeSpaceValue)
				{
					playerTwoPieceThreeSpaceValue = 0;
				}
				else if (playerOnePieceSixSpaceValue == playerTwoPieceTwoSpaceValue)
				{
					playerTwoPieceTwoSpaceValue = 0;
				}
				else if (playerOnePieceSixSpaceValue == playerTwoPieceOneSpaceValue)
				{
					playerTwoPieceOneSpaceValue = 0;
				}
				
				//Own Piece landed on

				else if (playerOnePieceSixSpaceValue == playerOnePieceSevenSpaceValue)
				{
					playerOnePieceSevenSpaceValue = 0;
				}
				else if (playerOnePieceSixSpaceValue == playerOnePieceFiveSpaceValue)
				{
					playerOnePieceFiveSpaceValue = 0;
				}
				else if (playerOnePieceSixSpaceValue == playerOnePieceFourSpaceValue)
				{
					playerOnePieceFourSpaceValue = 0;
				}
				else if (playerOnePieceSixSpaceValue == playerOnePieceThreeSpaceValue)
				{
					playerOnePieceThreeSpaceValue = 0;
				}
				else if (playerOnePieceSixSpaceValue == playerOnePieceTwoSpaceValue)
				{
					playerOnePieceTwoSpaceValue = 0;
				}
				else if (playerOnePieceSixSpaceValue == playerOnePieceOneSpaceValue)
				{
					playerOnePieceOneSpaceValue = 0;
				}
				playerTwo();
			}
			if (playerOnePieceSixDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playerOne();
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
				playerOne();
			}
			playerOnePieceFiveSpaceValue = playerOnePieceFiveSpaceValue + P1TotalDie;
			
			
			// Check if land on piece
			//Player Two landed on
			if (playerOnePieceFiveSpaceValue < 3 || playerOnePieceFiveSpaceValue > 10)
			{
				 if (playerOnePieceFiveSpaceValue == playerOnePieceSevenSpaceValue)
					{
						playerOnePieceSevenSpaceValue = 0;
					}
					else if (playerOnePieceFiveSpaceValue == playerOnePieceSixSpaceValue)
					{
						playerOnePieceSixSpaceValue = 0;
					}
					else if (playerOnePieceFiveSpaceValue == playerOnePieceFourSpaceValue)
					{
						playerOnePieceFourSpaceValue = 0;
					}
					else if (playerOnePieceFiveSpaceValue == playerOnePieceThreeSpaceValue)
					{
						playerOnePieceThreeSpaceValue = 0;
					}
					else if (playerOnePieceFiveSpaceValue == playerOnePieceTwoSpaceValue)
					{
						playerOnePieceTwoSpaceValue = 0;
					}
					else if (playerOnePieceFiveSpaceValue == playerOnePieceOneSpaceValue)
					{
						playerOnePieceOneSpaceValue = 0;
					}
				
				playerTwo();
			}
			if (playerOnePieceFiveSpaceValue == playerTwoPieceSevenSpaceValue)
			{
				playerTwoPieceSevenSpaceValue = 0;
			}
			else if (playerOnePieceFiveSpaceValue == playerTwoPieceSixSpaceValue)
			{
				playerTwoPieceSixSpaceValue = 0;
			}
			else if (playerOnePieceFiveSpaceValue == playerTwoPieceFiveSpaceValue)
			{
				playerTwoPieceFiveSpaceValue = 0;
			}
			else if (playerOnePieceFiveSpaceValue == playerTwoPieceFourSpaceValue)
			{
				playerTwoPieceFourSpaceValue = 0;
			}
			else if (playerOnePieceFiveSpaceValue == playerTwoPieceThreeSpaceValue)
			{
				playerTwoPieceThreeSpaceValue = 0;
			}
			else if (playerOnePieceFiveSpaceValue == playerTwoPieceTwoSpaceValue)
			{
				playerTwoPieceTwoSpaceValue = 0;
			}
			else if (playerOnePieceFiveSpaceValue == playerTwoPieceOneSpaceValue)
			{
				playerTwoPieceOneSpaceValue = 0;
			}
			
			//Own Piece landed on

			else if (playerOnePieceFiveSpaceValue == playerOnePieceSevenSpaceValue)
			{
				playerOnePieceSevenSpaceValue = 0;
			}
			else if (playerOnePieceFiveSpaceValue == playerOnePieceSixSpaceValue)
			{
				playerOnePieceSixSpaceValue = 0;
			}
			else if (playerOnePieceFiveSpaceValue == playerOnePieceFourSpaceValue)
			{
				playerOnePieceFourSpaceValue = 0;
			}
			else if (playerOnePieceFiveSpaceValue == playerOnePieceThreeSpaceValue)
			{
				playerOnePieceThreeSpaceValue = 0;
			}
			else if (playerOnePieceFiveSpaceValue == playerOnePieceTwoSpaceValue)
			{
				playerOnePieceTwoSpaceValue = 0;
			}
			else if (playerOnePieceFiveSpaceValue == playerOnePieceOneSpaceValue)
			{
				playerOnePieceOneSpaceValue = 0;
			}
			playerTwo();
			}
			if (playerOnePieceFiveDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playerOne();
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
				playerOne();
			}
			playerOnePieceFourSpaceValue = playerOnePieceFourSpaceValue + P1TotalDie;
			
			
			// Check if land on piece
			//Player Two landed on
			if (playerOnePieceFourSpaceValue < 3 || playerOnePieceFourSpaceValue > 10)
			{
				if (playerOnePieceFourSpaceValue == playerOnePieceSevenSpaceValue)
				{
					playerOnePieceSevenSpaceValue = 0;
				}
				else if (playerOnePieceFourSpaceValue == playerOnePieceSixSpaceValue)
				{
					playerOnePieceSixSpaceValue = 0;
				}
				else if (playerOnePieceFourSpaceValue == playerOnePieceFiveSpaceValue)
				{
					playerOnePieceFiveSpaceValue = 0;
				}
				else if (playerOnePieceFourSpaceValue == playerOnePieceThreeSpaceValue)
				{
					playerOnePieceThreeSpaceValue = 0;
				}
				else if (playerOnePieceFourSpaceValue == playerOnePieceTwoSpaceValue)
				{
					playerOnePieceTwoSpaceValue = 0;
				}
				else if (playerOnePieceFourSpaceValue == playerOnePieceOneSpaceValue)
				{
					playerOnePieceOneSpaceValue = 0;
				}		
				
				playerTwo();
			}
			if (playerOnePieceFourSpaceValue == playerTwoPieceSevenSpaceValue)
			{
				playerTwoPieceSevenSpaceValue = 0;
			}
			else if (playerOnePieceFourSpaceValue == playerTwoPieceSixSpaceValue)
			{
				playerTwoPieceSixSpaceValue = 0;
			}
			else if (playerOnePieceFourSpaceValue == playerTwoPieceFiveSpaceValue)
			{
				playerTwoPieceFiveSpaceValue = 0;
			}
			else if (playerOnePieceFourSpaceValue == playerTwoPieceFourSpaceValue)
			{
				playerTwoPieceFourSpaceValue = 0;
			}
			else if (playerOnePieceFourSpaceValue == playerTwoPieceThreeSpaceValue)
			{
				playerTwoPieceThreeSpaceValue = 0;
			}
			else if (playerOnePieceFourSpaceValue == playerTwoPieceTwoSpaceValue)
			{
				playerTwoPieceTwoSpaceValue = 0;
			}
			else if (playerOnePieceFourSpaceValue == playerTwoPieceOneSpaceValue)
			{
				playerTwoPieceOneSpaceValue = 0;
			}
			
			//Own Piece landed on
			
			else if (playerOnePieceFourSpaceValue == playerOnePieceSevenSpaceValue)
			{
				playerOnePieceSevenSpaceValue = 0;
			}
			else if (playerOnePieceFourSpaceValue == playerOnePieceSixSpaceValue)
			{
				playerOnePieceSixSpaceValue = 0;
			}
			else if (playerOnePieceFourSpaceValue == playerOnePieceFiveSpaceValue)
			{
				playerOnePieceFiveSpaceValue = 0;
			}
			else if (playerOnePieceFourSpaceValue == playerOnePieceThreeSpaceValue)
			{
				playerOnePieceThreeSpaceValue = 0;
			}
			else if (playerOnePieceFourSpaceValue == playerOnePieceTwoSpaceValue)
			{
				playerOnePieceTwoSpaceValue = 0;
			}
			else if (playerOnePieceFourSpaceValue == playerOnePieceOneSpaceValue)
			{
				playerOnePieceOneSpaceValue = 0;
			}			
			playerTwo();
			}
			if (playerOnePieceFourDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playerOne();
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
				playerOne();
			}
			playerOnePieceThreeSpaceValue = playerOnePieceThreeSpaceValue + P1TotalDie;
			
			
			// Check if land on piece
			//Player Two landed on
			if (playerOnePieceThreeSpaceValue < 3 || playerOnePieceThreeSpaceValue > 10)
			{
				 if (playerOnePieceThreeSpaceValue == playerOnePieceSevenSpaceValue)
					{
						playerOnePieceSevenSpaceValue = 0;
					}
					else if (playerOnePieceThreeSpaceValue == playerOnePieceSixSpaceValue)
					{
						playerOnePieceSixSpaceValue = 0;
					}
					else if (playerOnePieceThreeSpaceValue == playerOnePieceFiveSpaceValue)
					{
						playerOnePieceFiveSpaceValue = 0;
					}
					else if (playerOnePieceThreeSpaceValue == playerOnePieceFourSpaceValue)
					{
						playerOnePieceFourSpaceValue = 0;
					}
					else if (playerOnePieceThreeSpaceValue == playerOnePieceTwoSpaceValue)
					{
						playerOnePieceTwoSpaceValue = 0;
					}
					else if (playerOnePieceThreeSpaceValue == playerOnePieceOneSpaceValue)
					{
						playerOnePieceOneSpaceValue = 0;
					}			
				
				playerTwo();
			}
			if (playerOnePieceThreeSpaceValue == playerTwoPieceSevenSpaceValue)
			{
				playerTwoPieceSevenSpaceValue = 0;
			}
			else if (playerOnePieceThreeSpaceValue == playerTwoPieceSixSpaceValue)
			{
				playerTwoPieceSixSpaceValue = 0;
			}
			else if (playerOnePieceThreeSpaceValue == playerTwoPieceFiveSpaceValue)
			{
				playerTwoPieceFiveSpaceValue = 0;
			}
			else if (playerOnePieceThreeSpaceValue == playerTwoPieceFourSpaceValue)
			{
				playerTwoPieceFourSpaceValue = 0;
			}
			else if (playerOnePieceThreeSpaceValue == playerTwoPieceThreeSpaceValue)
			{
				playerTwoPieceThreeSpaceValue = 0;
			}
			else if (playerOnePieceThreeSpaceValue == playerTwoPieceTwoSpaceValue)
			{
				playerTwoPieceTwoSpaceValue = 0;
			}
			else if (playerOnePieceThreeSpaceValue == playerTwoPieceOneSpaceValue)
			{
				playerTwoPieceOneSpaceValue = 0;
			}
			
			//Own Piece landed on
			
			else if (playerOnePieceThreeSpaceValue == playerOnePieceSevenSpaceValue)
			{
				playerOnePieceSevenSpaceValue = 0;
			}
			else if (playerOnePieceThreeSpaceValue == playerOnePieceSixSpaceValue)
			{
				playerOnePieceSixSpaceValue = 0;
			}
			else if (playerOnePieceThreeSpaceValue == playerOnePieceFiveSpaceValue)
			{
				playerOnePieceFiveSpaceValue = 0;
			}
			else if (playerOnePieceThreeSpaceValue == playerOnePieceFourSpaceValue)
			{
				playerOnePieceFourSpaceValue = 0;
			}
			else if (playerOnePieceThreeSpaceValue == playerOnePieceTwoSpaceValue)
			{
				playerOnePieceTwoSpaceValue = 0;
			}
			else if (playerOnePieceThreeSpaceValue == playerOnePieceOneSpaceValue)
			{
				playerOnePieceOneSpaceValue = 0;
			}						
			playerTwo();
			}
			if (playerOnePieceThreeDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playerOne();
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
				playerOne();
			}
			playerOnePieceTwoSpaceValue = playerOnePieceTwoSpaceValue + P1TotalDie;
			
			
			// Check if land on piece
			//Player Two landed on
			
			if (playerOnePieceTwoSpaceValue < 3 || playerOnePieceTwoSpaceValue > 10)
			{
				if (playerOnePieceTwoSpaceValue == playerOnePieceSevenSpaceValue)
				{
					playerOnePieceSevenSpaceValue = 0;
				}
				else if (playerOnePieceTwoSpaceValue == playerOnePieceSixSpaceValue)
				{
					playerOnePieceSixSpaceValue = 0;
				}
				else if (playerOnePieceTwoSpaceValue == playerOnePieceFiveSpaceValue)
				{
					playerOnePieceFiveSpaceValue = 0;
				}
				else if (playerOnePieceTwoSpaceValue == playerOnePieceFourSpaceValue)
				{
					playerOnePieceFourSpaceValue = 0;
				}
				else if (playerOnePieceTwoSpaceValue == playerOnePieceThreeSpaceValue)
				{
					playerOnePieceThreeSpaceValue = 0;
				}
				else if (playerOnePieceTwoSpaceValue == playerOnePieceOneSpaceValue)
				{
					playerOnePieceOneSpaceValue = 0;
				}		
				else
				{}
				
				playerTwo();
			}
			
			if (playerOnePieceTwoSpaceValue == playerTwoPieceSevenSpaceValue)
			{
				playerTwoPieceSevenSpaceValue = 0;
			}
			else if (playerOnePieceTwoSpaceValue == playerTwoPieceSixSpaceValue)
			{
				playerTwoPieceSixSpaceValue = 0;
			}
			else if (playerOnePieceTwoSpaceValue == playerTwoPieceFiveSpaceValue)
			{
				playerTwoPieceFiveSpaceValue = 0;
			}
			else if (playerOnePieceTwoSpaceValue == playerTwoPieceFourSpaceValue)
			{
				playerTwoPieceFourSpaceValue = 0;
			}
			else if (playerOnePieceTwoSpaceValue == playerTwoPieceThreeSpaceValue)
			{
				playerTwoPieceThreeSpaceValue = 0;
			}
			else if (playerOnePieceTwoSpaceValue == playerTwoPieceTwoSpaceValue)
			{
				playerTwoPieceTwoSpaceValue = 0;
			}
			else if (playerOnePieceTwoSpaceValue == playerTwoPieceOneSpaceValue)
			{
				playerTwoPieceOneSpaceValue = 0;
			}
			
			//Own Piece landed on
			
			else if (playerOnePieceTwoSpaceValue == playerOnePieceSevenSpaceValue)
			{
				playerOnePieceSevenSpaceValue = 0;
			}
			else if (playerOnePieceTwoSpaceValue == playerOnePieceSixSpaceValue)
			{
				playerOnePieceSixSpaceValue = 0;
			}
			else if (playerOnePieceTwoSpaceValue == playerOnePieceFiveSpaceValue)
			{
				playerOnePieceFiveSpaceValue = 0;
			}
			else if (playerOnePieceTwoSpaceValue == playerOnePieceFourSpaceValue)
			{
				playerOnePieceFourSpaceValue = 0;
			}
			else if (playerOnePieceTwoSpaceValue == playerOnePieceThreeSpaceValue)
			{
				playerOnePieceThreeSpaceValue = 0;
			}
			else if (playerOnePieceTwoSpaceValue == playerOnePieceOneSpaceValue)
			{
				playerOnePieceOneSpaceValue = 0;
			}		
			else
			{}
			playerTwo();
			
			}
			if (playerOnePieceTwoDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playerOne();
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
				playerOne();
			}
			playerOnePieceOneSpaceValue = playerOnePieceOneSpaceValue + P1TotalDie;
			
			
			// Check if land on piece
			//Player Two landed on
			if (playerOnePieceOneSpaceValue < 3 || playerOnePieceOneSpaceValue > 10)
			{
				 if (playerOnePieceOneSpaceValue == playerOnePieceSevenSpaceValue)
					{
						playerOnePieceSevenSpaceValue = 0;
					}
					else if (playerOnePieceOneSpaceValue == playerOnePieceSixSpaceValue)
					{
						playerOnePieceSixSpaceValue = 0;
					}
					else if (playerOnePieceOneSpaceValue == playerOnePieceFiveSpaceValue)
					{
						playerOnePieceFiveSpaceValue = 0;
					}
					else if (playerOnePieceOneSpaceValue == playerOnePieceFourSpaceValue)
					{
						playerOnePieceFourSpaceValue = 0;
					}
					else if (playerOnePieceOneSpaceValue == playerOnePieceThreeSpaceValue)
					{
						playerOnePieceThreeSpaceValue = 0;
					}
					else if (playerOnePieceOneSpaceValue == playerOnePieceTwoSpaceValue)
					{
						playerOnePieceTwoSpaceValue = 0;
					}			
				
				playerTwo();
			}
			if (playerOnePieceOneSpaceValue == playerTwoPieceSevenSpaceValue)
			{
				playerTwoPieceSevenSpaceValue = 0;
			}
			else if (playerOnePieceOneSpaceValue == playerTwoPieceSixSpaceValue)
			{
				playerTwoPieceSixSpaceValue = 0;
			}
			else if (playerOnePieceOneSpaceValue == playerTwoPieceFiveSpaceValue)
			{
				playerTwoPieceFiveSpaceValue = 0;
			}
			else if (playerOnePieceOneSpaceValue == playerTwoPieceFourSpaceValue)
			{
				playerTwoPieceFourSpaceValue = 0;
			}
			else if (playerOnePieceOneSpaceValue == playerTwoPieceThreeSpaceValue)
			{
				playerTwoPieceThreeSpaceValue = 0;
			}
			else if (playerOnePieceOneSpaceValue == playerTwoPieceTwoSpaceValue)
			{
				playerTwoPieceTwoSpaceValue = 0;
			}
			else if (playerOnePieceOneSpaceValue == playerTwoPieceOneSpaceValue)
			{
				playerTwoPieceOneSpaceValue = 0;
			}
			
			//Own Piece landed on
			
			else if (playerOnePieceOneSpaceValue == playerOnePieceSevenSpaceValue)
			{
				playerOnePieceSevenSpaceValue = 0;
			}
			else if (playerOnePieceOneSpaceValue == playerOnePieceSixSpaceValue)
			{
				playerOnePieceSixSpaceValue = 0;
			}
			else if (playerOnePieceOneSpaceValue == playerOnePieceFiveSpaceValue)
			{
				playerOnePieceFiveSpaceValue = 0;
			}
			else if (playerOnePieceOneSpaceValue == playerOnePieceFourSpaceValue)
			{
				playerOnePieceFourSpaceValue = 0;
			}
			else if (playerOnePieceOneSpaceValue == playerOnePieceThreeSpaceValue)
			{
				playerOnePieceThreeSpaceValue = 0;
			}
			else if (playerOnePieceOneSpaceValue == playerOnePieceTwoSpaceValue)
			{
				playerOnePieceTwoSpaceValue = 0;
			}			
			playerTwo();
			}
			if (playerOnePieceOneDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playerOne();
			}

		}
	}
		
		
		//PLAYER TWO
		
	}
	public static void playerTwo()
	{
		{
			P1TotalDie = 0;
			
		String[] options = new String[] {"Piece 7", "Piece 6", "Piece 5", "Piece 4", "Piece 3", "Piece 2", "Piece 1", "Roll", "Exit"};
		int selection;
		
		String turn = "Player Two";	
		selection = 10;

		space1 = "[          ]";
		space2 = "[          ]";
		space3 = "[          ]";
		space4 = "[          ]";
		space5 = "[          ]";
		space6 = "[          ]";
		space7 = "[          ]";
		space8 = "[          ]";
		space9 = "[          ]";
		space10 = "[          ]";
		space11 = "[          ]";
		space12 = "[          ]";
		p1space13 = "[          ]";
		p1space14 = "[          ]";
		p1space15 = "[          ]";
		p1space16 = "[          ]";
		p2space13 = "[          ]";
		p2space14 = "[          ]";
		p2space15 = "[          ]";
		p2space16 = "[          ]";
		
		
		
		// Check piece seven space value
		if (playerTwoPieceSevenSpaceValue == 1)
		{ space3 = "[P2p1]"; } 
		else if (playerTwoPieceSevenSpaceValue == 2)
		{ space4 = "[P2p1]"; }		
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
		{ p2space13 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 12)
		{ p2space14 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 13)
		{ p2space15 = "[P2p1]"; }
		else if (playerTwoPieceSevenSpaceValue == 14)
		{ p2space16 = "[P2p1]"; }
		if(playerTwoPieceSevenSpaceValue > 14)
		{
			playerTwoPieceSevenSpaceValue = 0;

			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceSevenDone = 1;
			
			playerOne();
		}
		else
		{ }
		
		
		//Check piece six space value
		if (playerTwoPieceSixSpaceValue == 1)
		{ space3 = "[P2p2]"; }
		
		if (playerTwoPieceSixSpaceValue == 2)
		{
			space4 = "[P2p2]";
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
			p2space13 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 12)
		{
			p2space14 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 13)
		{
			p2space15 = "[P2p2]";
		}
		if (playerTwoPieceSixSpaceValue == 14)
		{
			p2space16 = "[P2p2]";
		}
		if(playerTwoPieceSixSpaceValue > 14)
		{
			playerTwoPieceSixSpaceValue = 0;
			
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceSixDone = 1;
			
			playerOne();
		}
		
		//check piece five
		if (playerTwoPieceFiveSpaceValue == 1)
		{				
			space3 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 2)
		{
			space4 = "[P2p3]";
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
			p2space13 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 12)
		{

			p2space14 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 13)
		{
			p2space15 = "[P2p3]";
		}
		if (playerTwoPieceFiveSpaceValue == 14)
		{
			p2space16 = "[P2p3]";
		}
		if(playerTwoPieceFiveSpaceValue > 14)
		{
			playerTwoPieceFiveSpaceValue = 0;
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceFiveDone = 1;
			
			playerOne();
		}
		
		//Piece Four
		if (playerTwoPieceFourSpaceValue == 1)
		{
			space3 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 2)
		{
			space4 = "[P2p4]";
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
			p2space13 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 12)
		{
			p2space14 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 13)
		{
			p2space15 = "[P2p4]";
		}
		if (playerTwoPieceFourSpaceValue == 14)
		{
			p2space16 = "[P2p4]";
		}
		if(playerTwoPieceFourSpaceValue > 14)
		{
			playerTwoPieceFourSpaceValue = 0;
			
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceFourDone = 1;
			
			playerOne();
		}
		
		//Piece Three
		if (playerTwoPieceThreeSpaceValue == 1)
		{
			space3 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 2)
		{
			space4 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 3)
		{
			space5 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 4)
		{
			space6 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 5)
		{
			space7 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 6)
		{
			space8 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 7)
		{
			space9 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 8)
		{
			space10 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 9)
		{
			space11 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 10)
		{
			space12 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 11)
		{
			p2space13 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 12)
		{
			p2space14 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 13)
		{
			p2space15 = "[P2p5]";
		}
		if (playerTwoPieceThreeSpaceValue == 14)
		{
			p2space16 = "[P2p5]";
		}
		if(playerTwoPieceThreeSpaceValue > 14)
		{
			playerTwoPieceThreeSpaceValue = 0;
			
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceThreeDone = 1;
			
			playerOne();
		}
		
		//Piece Two
		if (playerTwoPieceTwoSpaceValue == 1)
		{
			
			space3 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 2)
		{
			space4 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 3)
		{
			space5 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 4)
		{
			space6 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 5)
		{
			space7 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 6)
		{
			space8 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 7)
		{
			space9 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 8)
		{
			space10 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 9)
		{
			space11 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 10)
		{
			space12 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 11)
		{
			p2space13 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 12)
		{
			p2space14 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 13)
		{
			p2space15 = "[P2p6]";
		}
		if (playerTwoPieceTwoSpaceValue == 14)
		{
			p2space16 = "[P2p6]";
		}
		if(playerTwoPieceTwoSpaceValue > 14)
		{
			playerTwoPieceTwoSpaceValue = 0;
			
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceTwoDone = 1;
			
			playerOne();
		}
		
		//Piece One
		if (playerTwoPieceOneSpaceValue == 1)
		{
			space3 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 2)
		{
			space4 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 3)
		{
			space5 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 4)
		{
			space6 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 5)
		{
			space7 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 6)
		{
			space8 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 7)
		{
			space9 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 8)
		{
			space10 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 9)
		{
			space11 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 10)
		{
			space12 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 11)
		{
			p2space13 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 12)
		{
			p2space14 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 13)
		{
			p2space15 = "[P2p7]";
		}
		if (playerTwoPieceOneSpaceValue == 14)
		{
			p2space16 = "[P2p7]";
		}
		if(playerTwoPieceOneSpaceValue > 14)
		{
			playerTwoPieceOneSpaceValue = 0;
			
			scorePlayerTwo ++;
			
			JOptionPane.showMessageDialog(null, "Player two has " + scorePlayerTwo + " points.");
			playerTwoPieceOneDone = 1;
			
			playerOne();
		}
		
		//Check player One space values

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
		{ p1space13 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 12)
		{ p1space14 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 13)
		{ p1space15 = "[P1p1]"; }
		else if (playerOnePieceSevenSpaceValue == 14)
		{ p1space16 = "[P1p1]"; }
		if(playerOnePieceSevenSpaceValue > 14)
		{
			playerOnePieceSevenSpaceValue = 0;

			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceSevenDone = 1;
			
			playerTwo();
		}
		else
		{ }
		
		
		//Check piece six space value
		if (playerOnePieceSixSpaceValue == 1)
		{ space1 = "[P1p2]"; }
		
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
			p1space13 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 12)
		{
			p1space14 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 13)
		{
			p1space15 = "[P1p2]";
		}
		if (playerOnePieceSixSpaceValue == 14)
		{
			p1space16 = "[P1p2]";
		}
		if(playerOnePieceSixSpaceValue > 14)
		{
			playerOnePieceSixSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceSixDone = 1;
			
			playerTwo();
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
			p1space13 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 12)
		{

			p1space14 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 13)
		{
			p1space15 = "[P1p3]";
		}
		if (playerOnePieceFiveSpaceValue == 14)
		{
			p1space16 = "[P1p3]";
		}
		if(playerOnePieceFiveSpaceValue > 14)
		{
			playerOnePieceFiveSpaceValue = 0;
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceFiveDone = 1;
			
			playerTwo();
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
			p1space13 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 12)
		{
			p1space14 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 13)
		{
			p1space15 = "[P1p4]";
		}
		if (playerOnePieceFourSpaceValue == 14)
		{
			p1space16 = "[P1p4]";
		}
		if(playerOnePieceFourSpaceValue > 14)
		{
			playerOnePieceFourSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceFourDone = 1;
			
			playerTwo();
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
			p1space13 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 12)
		{
			p1space14 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 13)
		{
			p1space15 = "[P1p5]";
		}
		if (playerOnePieceThreeSpaceValue == 14)
		{
			p1space16 = "[P1p5]";
		}
		if(playerOnePieceThreeSpaceValue > 14)
		{
			playerOnePieceThreeSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceThreeDone = 1;
			
			playerTwo();
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
			p1space13 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 12)
		{
			p1space14 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 13)
		{
			p1space15 = "[P1p6]";
		}
		if (playerOnePieceTwoSpaceValue == 14)
		{
			p1space16 = "[P1p6]";
		}
		if(playerOnePieceTwoSpaceValue > 14)
		{
			playerOnePieceTwoSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceTwoDone = 1;
			
			playerTwo();
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
			p1space13 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 12)
		{
			p1space14 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 13)
		{
			p1space15 = "[P1p7]";
		}
		if (playerOnePieceOneSpaceValue == 14)
		{
			p1space16 = "[P1p7]";
		}
		if(playerOnePieceOneSpaceValue > 14)
		{
			playerOnePieceOneSpaceValue = 0;
			
			scorePlayerOne ++;
			
			JOptionPane.showMessageDialog(null, "Player one has " + scorePlayerOne + " points.");
			playerOnePieceOneDone = 1;
			
			playerTwo();
		}
		
		// Draw the Board
		selection = JOptionPane.showOptionDialog(null, "Which piece would you like to move?\n"
				+ p2space13 + p2space14 + p2space15 + p2space16 + "                         " + space1 + space2 + "\n"
				+ space12 + space11 + space10 + space9 + space8 + space7 + space6 + space5 + "\n"
				+ p2space13 + p2space14 + p2space15 + p2space16 + "                         " + space3 + space4, turn, JOptionPane.DEFAULT_OPTION,
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
			diceRollPlayerTwo();
		}
		
		//Select Piece Seven
		if (selection == 6)
		{
			if (playerTwoPieceSevenDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playerTwo();
			}
			playerTwoPieceSevenSpaceValue = playerTwoPieceSevenSpaceValue + P2TotalDie;
			
			//check if pieces landed on pieces
	
			if (playerTwoPieceSevenSpaceValue < 3 || playerTwoPieceSevenSpaceValue > 10)
			{
				if (playerTwoPieceSevenSpaceValue == playerTwoPieceSixSpaceValue)
				{
					playerTwoPieceSixSpaceValue = 0;
				}
				else if (playerTwoPieceSevenSpaceValue == playerTwoPieceFiveSpaceValue)
				{
					playerTwoPieceFiveSpaceValue = 0;
				}
				else if (playerTwoPieceSevenSpaceValue == playerTwoPieceFourSpaceValue)
				{
					playerTwoPieceFourSpaceValue = 0;
				}
				else if (playerTwoPieceSevenSpaceValue == playerTwoPieceThreeSpaceValue)
				{
					playerTwoPieceThreeSpaceValue = 0;
				}
				else if (playerTwoPieceSevenSpaceValue == playerTwoPieceTwoSpaceValue)
				{
					playerTwoPieceTwoSpaceValue = 0;
				}
				else if (playerTwoPieceSevenSpaceValue == playerTwoPieceOneSpaceValue)
				{
					playerTwoPieceOneSpaceValue = 0;
				}
				else
				{
					
				}
				
				playerOne();
			}
			
			if (playerTwoPieceSevenSpaceValue == playerOnePieceSevenSpaceValue)
			{
				playerOnePieceSevenSpaceValue = 0;
			}
			else if (playerTwoPieceSevenSpaceValue == playerOnePieceSixSpaceValue)
			{
				playerOnePieceSixSpaceValue = 0;
			}
			else if (playerTwoPieceSevenSpaceValue == playerOnePieceFiveSpaceValue)
			{
				playerOnePieceFiveSpaceValue = 0;
			}
			else if (playerTwoPieceSevenSpaceValue == playerOnePieceFourSpaceValue)
			{
				playerOnePieceFourSpaceValue = 0;
			}
			else if (playerTwoPieceSevenSpaceValue == playerOnePieceThreeSpaceValue)
			{
				playerOnePieceThreeSpaceValue = 0;
			}
			else if (playerTwoPieceSevenSpaceValue == playerOnePieceTwoSpaceValue)
			{
				playerOnePieceTwoSpaceValue = 0;
			}
			else if (playerTwoPieceSevenSpaceValue == playerOnePieceOneSpaceValue)
			{
				playerOnePieceOneSpaceValue = 0;
			}
			
			//Own Piece landed on with piece seven
			
			else if (playerTwoPieceSevenSpaceValue == playerTwoPieceSixSpaceValue)
			{
				playerTwoPieceSixSpaceValue = 0;
			}
			else if (playerTwoPieceSevenSpaceValue == playerTwoPieceFiveSpaceValue)
			{
				playerTwoPieceFiveSpaceValue = 0;
			}
			else if (playerTwoPieceSevenSpaceValue == playerTwoPieceFourSpaceValue)
			{
				playerTwoPieceFourSpaceValue = 0;
			}
			else if (playerTwoPieceSevenSpaceValue == playerTwoPieceThreeSpaceValue)
			{
				playerTwoPieceThreeSpaceValue = 0;
			}
			else if (playerTwoPieceSevenSpaceValue == playerTwoPieceTwoSpaceValue)
			{
				playerTwoPieceTwoSpaceValue = 0;
			}
			else if (playerTwoPieceSevenSpaceValue == playerTwoPieceOneSpaceValue)
			{
				playerTwoPieceOneSpaceValue = 0;
			}
			else
			{
				
			}
			
			playerOne();
			
			}
			
			if (playerTwoPieceSevenDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces");
				playerTwo();
			}
		}
		
		//Select Piece Six
		if (selection == 5)
		{
			if (playerTwoPieceSixDone != 1)
			{
				if (roll == 0)
				{
					JOptionPane.showMessageDialog(null,"Please make a roll");
					playerTwo();
				}
				playerTwoPieceSixSpaceValue = playerTwoPieceSixSpaceValue + P2TotalDie;
				
				//check if pieces landed on pieces
				
				if (playerTwoPieceSixSpaceValue < 3 || playerTwoPieceSixSpaceValue > 10)
				{
					if (playerTwoPieceSixSpaceValue == playerTwoPieceSevenSpaceValue)
					{
						playerTwoPieceSevenSpaceValue = 0;
					}
					else if (playerTwoPieceSixSpaceValue == playerTwoPieceFiveSpaceValue)
					{
						playerTwoPieceFiveSpaceValue = 0;
					}
					else if (playerTwoPieceSixSpaceValue == playerTwoPieceFourSpaceValue)
					{
						playerTwoPieceFourSpaceValue = 0;
					}
					else if (playerTwoPieceSixSpaceValue == playerTwoPieceThreeSpaceValue)
					{
						playerTwoPieceThreeSpaceValue = 0;
					}
					else if (playerTwoPieceSixSpaceValue == playerTwoPieceTwoSpaceValue)
					{
						playerTwoPieceTwoSpaceValue = 0;
					}
					else if (playerTwoPieceSixSpaceValue == playerTwoPieceOneSpaceValue)
					{
						playerTwoPieceOneSpaceValue = 0;
					}
					else
					{
						
					}
					
					playerOne();
				}
				
				if (playerTwoPieceSixSpaceValue == playerOnePieceSevenSpaceValue)
				{
					playerOnePieceSevenSpaceValue = 0;
				}
				else if (playerTwoPieceSixSpaceValue == playerOnePieceSixSpaceValue)
				{
					playerOnePieceSixSpaceValue = 0;
				}
				else if (playerTwoPieceSixSpaceValue == playerOnePieceFiveSpaceValue)
				{
					playerOnePieceFiveSpaceValue = 0;
				}
				else if (playerTwoPieceSixSpaceValue == playerOnePieceFourSpaceValue)
				{
					playerOnePieceFourSpaceValue = 0;
				}
				else if (playerTwoPieceSixSpaceValue == playerOnePieceThreeSpaceValue)
				{
					playerOnePieceThreeSpaceValue = 0;
				}
				else if (playerTwoPieceSixSpaceValue == playerOnePieceTwoSpaceValue)
				{
					playerOnePieceTwoSpaceValue = 0;
				}
				else if (playerTwoPieceSixSpaceValue == playerOnePieceOneSpaceValue)
				{
					playerOnePieceOneSpaceValue = 0;
				}
				
				//Own Piece landed on with piece seven
				
				else if (playerTwoPieceSixSpaceValue == playerTwoPieceSevenSpaceValue)
				{
					playerTwoPieceSevenSpaceValue = 0;
				}
				else if (playerTwoPieceSixSpaceValue == playerTwoPieceFiveSpaceValue)
				{
					playerTwoPieceFiveSpaceValue = 0;
				}
				else if (playerTwoPieceSixSpaceValue == playerTwoPieceFourSpaceValue)
				{
					playerTwoPieceFourSpaceValue = 0;
				}
				else if (playerTwoPieceSixSpaceValue == playerTwoPieceThreeSpaceValue)
				{
					playerTwoPieceThreeSpaceValue = 0;
				}
				else if (playerTwoPieceSixSpaceValue == playerTwoPieceTwoSpaceValue)
				{
					playerTwoPieceTwoSpaceValue = 0;
				}
				else if (playerTwoPieceSixSpaceValue == playerTwoPieceOneSpaceValue)
				{
					playerTwoPieceOneSpaceValue = 0;
				}
				else
				{
					
				}
				
				playerOne();
			
			}
			if (playerTwoPieceSixDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playerTwo();
			}

		}
		
		//Select Piece Five
		if (selection == 4)
		{
			if (playerTwoPieceFiveDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playerTwo();
			}
			playerTwoPieceFiveSpaceValue = playerTwoPieceFiveSpaceValue + P2TotalDie;
			
			//check if pieces landed on pieces
			
			if (playerTwoPieceFiveSpaceValue < 3 || playerTwoPieceFiveSpaceValue > 10)
			{
				if (playerTwoPieceFiveSpaceValue == playerTwoPieceSevenSpaceValue)
				{
					playerTwoPieceSevenSpaceValue = 0;
				}
				else if (playerTwoPieceFiveSpaceValue == playerTwoPieceSixSpaceValue)
				{
					playerTwoPieceSixSpaceValue = 0;
				}
				else if (playerTwoPieceFiveSpaceValue == playerTwoPieceFourSpaceValue)
				{
					playerTwoPieceFourSpaceValue = 0;
				}
				else if (playerTwoPieceFiveSpaceValue == playerTwoPieceThreeSpaceValue)
				{
					playerTwoPieceThreeSpaceValue = 0;
				}
				else if (playerTwoPieceFiveSpaceValue == playerTwoPieceTwoSpaceValue)
				{
					playerTwoPieceTwoSpaceValue = 0;
				}
				else if (playerTwoPieceFiveSpaceValue == playerTwoPieceOneSpaceValue)
				{
					playerTwoPieceOneSpaceValue = 0;
				}
				else
				{
					
				}
				
				playerTwo();
			}
			
			if (playerTwoPieceFiveSpaceValue == playerOnePieceSevenSpaceValue)
			{
				playerOnePieceSevenSpaceValue = 0;
			}
			else if (playerTwoPieceFiveSpaceValue == playerOnePieceSixSpaceValue)
			{
				playerOnePieceSixSpaceValue = 0;
			}
			else if (playerTwoPieceFiveSpaceValue == playerOnePieceFiveSpaceValue)
			{
				playerOnePieceFiveSpaceValue = 0;
			}
			else if (playerTwoPieceFiveSpaceValue == playerOnePieceFourSpaceValue)
			{
				playerOnePieceFourSpaceValue = 0;
			}
			else if (playerTwoPieceFiveSpaceValue == playerOnePieceThreeSpaceValue)
			{
				playerOnePieceThreeSpaceValue = 0;
			}
			else if (playerTwoPieceFiveSpaceValue == playerOnePieceTwoSpaceValue)
			{
				playerOnePieceTwoSpaceValue = 0;
			}
			else if (playerTwoPieceFiveSpaceValue == playerOnePieceOneSpaceValue)
			{
				playerOnePieceOneSpaceValue = 0;
			}
			
			//Own Piece landed on with piece seven
			
			else if (playerTwoPieceFiveSpaceValue == playerTwoPieceSevenSpaceValue)
			{
				playerTwoPieceSevenSpaceValue = 0;
			}
			else if (playerTwoPieceFiveSpaceValue == playerTwoPieceSixSpaceValue)
			{
				playerTwoPieceSixSpaceValue = 0;
			}
			else if (playerTwoPieceFiveSpaceValue == playerTwoPieceFourSpaceValue)
			{
				playerTwoPieceFourSpaceValue = 0;
			}
			else if (playerTwoPieceFiveSpaceValue == playerTwoPieceThreeSpaceValue)
			{
				playerTwoPieceThreeSpaceValue = 0;
			}
			else if (playerTwoPieceFiveSpaceValue == playerTwoPieceTwoSpaceValue)
			{
				playerTwoPieceTwoSpaceValue = 0;
			}
			else if (playerTwoPieceFiveSpaceValue == playerTwoPieceOneSpaceValue)
			{
				playerTwoPieceOneSpaceValue = 0;
			}
			else
			{
				
			}
			
			playerOne();
			
			}
			if (playerTwoPieceFiveDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playerTwo();
			}

		}
		
		//Select Piece Four
		if (selection == 3)
		{
			if (playerTwoPieceFourDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playerTwo();
			}
			playerTwoPieceFourSpaceValue = playerTwoPieceFourSpaceValue + P2TotalDie;
			
			if (playerTwoPieceFourSpaceValue < 3 || playerTwoPieceFourSpaceValue > 10)
			{
				if (playerTwoPieceFourSpaceValue == playerTwoPieceSevenSpaceValue)
				{
					playerTwoPieceSevenSpaceValue = 0;
				}
				else if (playerTwoPieceFourSpaceValue == playerTwoPieceSixSpaceValue)
				{
					playerTwoPieceSixSpaceValue = 0;
				}
				else if (playerTwoPieceFourSpaceValue == playerTwoPieceFiveSpaceValue)
				{
					playerTwoPieceFiveSpaceValue = 0;
				}
				else if (playerTwoPieceFourSpaceValue == playerTwoPieceThreeSpaceValue)
				{
					playerTwoPieceThreeSpaceValue = 0;
				}
				else if (playerTwoPieceFourSpaceValue == playerTwoPieceTwoSpaceValue)
				{
					playerTwoPieceTwoSpaceValue = 0;
				}
				else if (playerTwoPieceFourSpaceValue == playerTwoPieceOneSpaceValue)
				{
					playerTwoPieceOneSpaceValue = 0;
				}
				else
				{
					
				}
				
				playerOne();
			}
			
			if (playerTwoPieceFourSpaceValue == playerOnePieceSevenSpaceValue)
			{
				playerOnePieceSevenSpaceValue = 0;
			}
			else if (playerTwoPieceFourSpaceValue == playerOnePieceSixSpaceValue)
			{
				playerOnePieceSixSpaceValue = 0;
			}
			else if (playerTwoPieceFourSpaceValue == playerOnePieceFiveSpaceValue)
			{
				playerOnePieceFiveSpaceValue = 0;
			}
			else if (playerTwoPieceFourSpaceValue == playerOnePieceFourSpaceValue)
			{
				playerOnePieceFourSpaceValue = 0;
			}
			else if (playerTwoPieceFourSpaceValue == playerOnePieceThreeSpaceValue)
			{
				playerOnePieceThreeSpaceValue = 0;
			}
			else if (playerTwoPieceFourSpaceValue == playerOnePieceTwoSpaceValue)
			{
				playerOnePieceTwoSpaceValue = 0;
			}
			else if (playerTwoPieceFourSpaceValue == playerOnePieceOneSpaceValue)
			{
				playerOnePieceOneSpaceValue = 0;
			}
			
			//Own Piece landed on with piece seven
			
			else if (playerTwoPieceFourSpaceValue == playerTwoPieceSevenSpaceValue)
			{
				playerTwoPieceSevenSpaceValue = 0;
			}
			else if (playerTwoPieceFourSpaceValue == playerTwoPieceSixSpaceValue)
			{
				playerTwoPieceSixSpaceValue = 0;
			}
			else if (playerTwoPieceFourSpaceValue == playerTwoPieceFiveSpaceValue)
			{
				playerTwoPieceFiveSpaceValue = 0;
			}
			else if (playerTwoPieceFourSpaceValue == playerTwoPieceThreeSpaceValue)
			{
				playerTwoPieceThreeSpaceValue = 0;
			}
			else if (playerTwoPieceFourSpaceValue == playerTwoPieceTwoSpaceValue)
			{
				playerTwoPieceTwoSpaceValue = 0;
			}
			else if (playerTwoPieceFourSpaceValue == playerTwoPieceOneSpaceValue)
			{
				playerTwoPieceOneSpaceValue = 0;
			}
			else
			{
				
			}
			
			playerOne();
			
			}
			if (playerTwoPieceFourDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playerTwo();
			}

		}
		
		//Select Piece Three
		if (selection == 2)
		{
			if (playerTwoPieceThreeDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playerTwo();
			}
			playerTwoPieceThreeSpaceValue = playerTwoPieceThreeSpaceValue + P2TotalDie;
			
			if (playerTwoPieceThreeSpaceValue < 3 || playerTwoPieceThreeSpaceValue > 10)
			{
				if (playerTwoPieceThreeSpaceValue == playerTwoPieceSevenSpaceValue)
				{
					playerTwoPieceSevenSpaceValue = 0;
				}
				else if (playerTwoPieceThreeSpaceValue == playerTwoPieceSixSpaceValue)
				{
					playerTwoPieceSixSpaceValue = 0;
				}
				else if (playerTwoPieceThreeSpaceValue == playerTwoPieceFiveSpaceValue)
				{
					playerTwoPieceFiveSpaceValue = 0;
				}
				else if (playerTwoPieceThreeSpaceValue == playerTwoPieceFourSpaceValue)
				{
					playerTwoPieceFourSpaceValue = 0;
				}
				else if (playerTwoPieceThreeSpaceValue == playerTwoPieceTwoSpaceValue)
				{
					playerTwoPieceTwoSpaceValue = 0;
				}
				else if (playerTwoPieceThreeSpaceValue == playerTwoPieceOneSpaceValue)
				{
					playerTwoPieceOneSpaceValue = 0;
				}
				else
				{
					
				}
				
				playerOne();
			}
			
			if (playerTwoPieceThreeSpaceValue == playerOnePieceSevenSpaceValue)
			{
				playerOnePieceSevenSpaceValue = 0;
			}
			else if (playerTwoPieceThreeSpaceValue == playerOnePieceSixSpaceValue)
			{
				playerOnePieceSixSpaceValue = 0;
			}
			else if (playerTwoPieceThreeSpaceValue == playerOnePieceFiveSpaceValue)
			{
				playerOnePieceFiveSpaceValue = 0;
			}
			else if (playerTwoPieceThreeSpaceValue == playerOnePieceFourSpaceValue)
			{
				playerOnePieceFourSpaceValue = 0;
			}
			else if (playerTwoPieceThreeSpaceValue == playerOnePieceThreeSpaceValue)
			{
				playerOnePieceThreeSpaceValue = 0;
			}
			else if (playerTwoPieceThreeSpaceValue == playerOnePieceTwoSpaceValue)
			{
				playerOnePieceTwoSpaceValue = 0;
			}
			else if (playerTwoPieceThreeSpaceValue == playerOnePieceOneSpaceValue)
			{
				playerOnePieceOneSpaceValue = 0;
			}
			
			//Own Piece landed on with piece seven
			
			else if (playerTwoPieceThreeSpaceValue == playerTwoPieceSevenSpaceValue)
			{
				playerTwoPieceSevenSpaceValue = 0;
			}
			else if (playerTwoPieceThreeSpaceValue == playerTwoPieceSixSpaceValue)
			{
				playerTwoPieceSixSpaceValue = 0;
			}
			else if (playerTwoPieceThreeSpaceValue == playerTwoPieceFiveSpaceValue)
			{
				playerTwoPieceFiveSpaceValue = 0;
			}
			else if (playerTwoPieceThreeSpaceValue == playerTwoPieceFourSpaceValue)
			{
				playerTwoPieceFourSpaceValue = 0;
			}
			else if (playerTwoPieceThreeSpaceValue == playerTwoPieceTwoSpaceValue)
			{
				playerTwoPieceTwoSpaceValue = 0;
			}
			else if (playerTwoPieceThreeSpaceValue == playerTwoPieceOneSpaceValue)
			{
				playerTwoPieceOneSpaceValue = 0;
			}
			else
			{
				
			}
			
			playerOne();
			
			}
			if (playerTwoPieceThreeDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playerTwo();
			}

		}
		
		//Select Piece Two
		if (selection == 1)
		{
			if (playerTwoPieceTwoDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playerTwo();
			}
			playerTwoPieceTwoSpaceValue = playerTwoPieceTwoSpaceValue + P2TotalDie;
			
			if (playerTwoPieceTwoSpaceValue < 3 || playerTwoPieceTwoSpaceValue > 10)
			{
				if (playerTwoPieceTwoSpaceValue == playerTwoPieceSevenSpaceValue)
				{
					playerTwoPieceSevenSpaceValue = 0;
				}
				else if (playerTwoPieceTwoSpaceValue == playerTwoPieceSixSpaceValue)
				{
					playerTwoPieceSixSpaceValue = 0;
				}
				else if (playerTwoPieceTwoSpaceValue == playerTwoPieceFiveSpaceValue)
				{
					playerTwoPieceFiveSpaceValue = 0;
				}
				else if (playerTwoPieceTwoSpaceValue == playerTwoPieceFourSpaceValue)
				{
					playerTwoPieceFourSpaceValue = 0;
				}
				else if (playerTwoPieceTwoSpaceValue == playerTwoPieceThreeSpaceValue)
				{
					playerTwoPieceThreeSpaceValue = 0;
				}
				else if (playerTwoPieceTwoSpaceValue == playerTwoPieceOneSpaceValue)
				{
					playerTwoPieceOneSpaceValue = 0;
				}
				else
				{
					
				}
				
				playerOne();
			}
			
			if (playerTwoPieceTwoSpaceValue == playerOnePieceSevenSpaceValue)
			{
				playerOnePieceSevenSpaceValue = 0;
			}
			else if (playerTwoPieceTwoSpaceValue == playerOnePieceSixSpaceValue)
			{
				playerOnePieceSixSpaceValue = 0;
			}
			else if (playerTwoPieceTwoSpaceValue == playerOnePieceFiveSpaceValue)
			{
				playerOnePieceFiveSpaceValue = 0;
			}
			else if (playerTwoPieceTwoSpaceValue == playerOnePieceFourSpaceValue)
			{
				playerOnePieceFourSpaceValue = 0;
			}
			else if (playerTwoPieceTwoSpaceValue == playerOnePieceThreeSpaceValue)
			{
				playerOnePieceThreeSpaceValue = 0;
			}
			else if (playerTwoPieceTwoSpaceValue == playerOnePieceTwoSpaceValue)
			{
				playerOnePieceTwoSpaceValue = 0;
			}
			else if (playerTwoPieceTwoSpaceValue == playerOnePieceOneSpaceValue)
			{
				playerOnePieceOneSpaceValue = 0;
			}
			
			//Own Piece landed on with piece seven
			else if (playerTwoPieceTwoSpaceValue == playerTwoPieceSevenSpaceValue)
			{
				playerTwoPieceSevenSpaceValue = 0;
			}
			else if (playerTwoPieceTwoSpaceValue == playerTwoPieceSixSpaceValue)
			{
				playerTwoPieceSixSpaceValue = 0;
			}
			else if (playerTwoPieceTwoSpaceValue == playerTwoPieceFiveSpaceValue)
			{
				playerTwoPieceFiveSpaceValue = 0;
			}
			else if (playerTwoPieceTwoSpaceValue == playerTwoPieceFourSpaceValue)
			{
				playerTwoPieceFourSpaceValue = 0;
			}
			else if (playerTwoPieceTwoSpaceValue == playerTwoPieceThreeSpaceValue)
			{
				playerTwoPieceThreeSpaceValue = 0;
			}
			else if (playerTwoPieceTwoSpaceValue == playerTwoPieceOneSpaceValue)
			{
				playerTwoPieceOneSpaceValue = 0;
			}
			else
			{
				
			}
			
			playerOne();
			
			}
			if (playerTwoPieceTwoDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playerTwo();
			}

		}
		
		//Select Piece One
		if (selection == 0)
		{
			if (playerTwoPieceOneDone != 1)
			{
			if (roll == 0)
			{
				JOptionPane.showMessageDialog(null,"Please make a roll");
				playerTwo();
			}
			playerTwoPieceOneSpaceValue = playerTwoPieceOneSpaceValue + P2TotalDie;
			
			if (playerTwoPieceOneSpaceValue < 3 || playerTwoPieceOneSpaceValue > 10)
			{
				if (playerTwoPieceOneSpaceValue == playerTwoPieceSevenSpaceValue)
				{
					playerTwoPieceSevenSpaceValue = 0;
				}
				else if (playerTwoPieceOneSpaceValue == playerTwoPieceSixSpaceValue)
				{
					playerTwoPieceSixSpaceValue = 0;
				}
				else if (playerTwoPieceOneSpaceValue == playerTwoPieceFiveSpaceValue)
				{
					playerTwoPieceFiveSpaceValue = 0;
				}
				else if (playerTwoPieceOneSpaceValue == playerTwoPieceFourSpaceValue)
				{
					playerTwoPieceFourSpaceValue = 0;
				}
				else if (playerTwoPieceOneSpaceValue == playerTwoPieceThreeSpaceValue)
				{
					playerTwoPieceThreeSpaceValue = 0;
				}
				else if (playerTwoPieceOneSpaceValue == playerTwoPieceTwoSpaceValue)
				{
					playerTwoPieceTwoSpaceValue = 0;
				}
				else
				{
					
				}
				playerOne();
			}
			
			if (playerTwoPieceOneSpaceValue == playerOnePieceSevenSpaceValue)
			{
				playerOnePieceSevenSpaceValue = 0;
			}
			else if (playerTwoPieceOneSpaceValue == playerOnePieceSixSpaceValue)
			{
				playerOnePieceSixSpaceValue = 0;
			}
			else if (playerTwoPieceOneSpaceValue == playerOnePieceFiveSpaceValue)
			{
				playerOnePieceFiveSpaceValue = 0;
			}
			else if (playerTwoPieceOneSpaceValue == playerOnePieceFourSpaceValue)
			{
				playerOnePieceFourSpaceValue = 0;
			}
			else if (playerTwoPieceOneSpaceValue == playerOnePieceThreeSpaceValue)
			{
				playerOnePieceThreeSpaceValue = 0;
			}
			else if (playerTwoPieceOneSpaceValue == playerOnePieceTwoSpaceValue)
			{
				playerOnePieceTwoSpaceValue = 0;
			}
			else if (playerTwoPieceOneSpaceValue == playerOnePieceOneSpaceValue)
			{
				playerOnePieceOneSpaceValue = 0;
			}
			
			//Own Piece landed on with piece seven
			
			else if (playerTwoPieceOneSpaceValue == playerTwoPieceSevenSpaceValue)
			{
				playerTwoPieceSevenSpaceValue = 0;
			}
			else if (playerTwoPieceOneSpaceValue == playerTwoPieceSixSpaceValue)
			{
				playerTwoPieceSixSpaceValue = 0;
			}
			else if (playerTwoPieceOneSpaceValue == playerTwoPieceFiveSpaceValue)
			{
				playerTwoPieceFiveSpaceValue = 0;
			}
			else if (playerTwoPieceOneSpaceValue == playerTwoPieceFourSpaceValue)
			{
				playerTwoPieceFourSpaceValue = 0;
			}
			else if (playerTwoPieceOneSpaceValue == playerTwoPieceThreeSpaceValue)
			{
				playerTwoPieceThreeSpaceValue = 0;
			}
			else if (playerTwoPieceOneSpaceValue == playerTwoPieceTwoSpaceValue)
			{
				playerTwoPieceTwoSpaceValue = 0;
			}
			else
			{
				
			}
			
			playerOne();
			}
			if (playerTwoPieceOneDone == 1)
			{
				JOptionPane.showMessageDialog(null, "This piece has finished.\nComplete the board with your other pieces.");
				playerTwo();
			}

		}
		}
		playerOne();
	}
	public static void diceRollPlayerOne()
	{		
		P1DieOne = 0 + (int)(Math.random() * ((1 - 0) + 1));
		P1DieTwo = 0 + (int)(Math.random() * ((1 - 0) + 1));
		P1DieThree = 0 + (int)(Math.random() * ((1 - 0) + 1));
		P1DieFour = 0 + (int)(Math.random() * ((1 - 0) + 1));
		
		P1TotalDie = P1DieOne + P1DieTwo + P1DieThree + P1DieFour;
		
		if (P1TotalDie == 0)
		{
			P1TotalDie = 1;
		}
		
		JOptionPane.showMessageDialog(null, P1TotalDie);	
		
		playerOne();
	}
	public static void diceRollPlayerTwo()
	{
		P2DieOne = 0 + (int)(Math.random() * ((1 - 0) + 1));
		P2DieTwo = 0 + (int)(Math.random() * ((1 - 0) + 1));
		P2DieThree = 0 + (int)(Math.random() * ((1 - 0) + 1));
		P2DieFour = 0 + (int)(Math.random() * ((1 - 0) + 1));
		
		P2TotalDie = P2DieOne + P2DieTwo + P2DieThree + P2DieFour;
		
		if (P2TotalDie == 0)
		{
			P2TotalDie = 1;
		}
		
		JOptionPane.showMessageDialog(null, P2TotalDie);	
		
		playerTwo();
	}

}
