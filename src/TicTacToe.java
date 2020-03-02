import java.util.*;
public class TicTacToe {

	// variables
	static int random=0;
	static int randomCheck=0;
	static String letter="";
	static int checkToss=0;
	static int head=0;
	static int tail=1;
	static String wonToss="";
	static String lossToss="";
	static int i=0;
	static int j=0;
	static int randomI=0;
	static int randomJ=0;
	//Declaring 2D array for getting board.
	static char[][] arrayBoard=new char[3][3];
	static Random r=new Random();
	
	//To generate random number.
	private static int getRandomNumber() {
		random=r.nextInt(2);
		return random;
		
	}
	
	//To know the if letter X or O is assigned to me.
	private static String getLetter() 
	{
		randomCheck=getRandomNumber();
		if(randomCheck==0)
		return "you will ahead with 'O'";
		else
		return "You will ahead with 'X'";
		
	}
	
	//To get the toss result.
	private static int getToss() 
	{
		randomCheck=getRandomNumber();
		if(randomCheck==head)
		{
			System.out.println("You won the toss congratulations go ahead now....");
		    return 1;
		}
		else
		{
			System.out.println("You lost the toss wait for your turn.... ");
			return 0;
		}
	}		
	
	//To display array as board.
	private static void arrayDisplay(char[][] arrayBoard)
	{
		for (int i = 0; i < arrayBoard.length; i++) 
		{
			for (int j = 0; j < arrayBoard.length; j++) 
			{
				if(arrayBoard[i][j]=='X' || arrayBoard[i][j]=='O')
				{
					System.out.print(arrayBoard[i][j]+" ");
				}
				else
				{
					System.out.print(0+" ");
				}
			}
			System.out.println();
		}
	}
	
	private static void computerUser(int checkToss)
	{
		if(checkToss==0)
		{
			randomI=r.nextInt(3);
			randomJ=r.nextInt(3);
			i=randomI;
			j=randomJ;
			System.out.println(i);
			System.out.println(j);
			arrayBoard[i][j]='X';
		}
		else
		{
			randomI=r.nextInt(3);
			randomJ=r.nextInt(3);
			i=randomI;
			j=randomJ;
			System.out.println(i);
			System.out.println(j);
			arrayBoard[i][j]='O';
		}
	}
	public static void main(String[] args)
	{
		
		letter=getLetter();
		System.out.println(letter);
		checkToss=getToss();
		computerUser(checkToss);
		arrayDisplay(arrayBoard);
		
	}
}
