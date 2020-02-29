import java.util.*;
public class TicTacToe {

	// variables
	static int random=0;
	static int randomCheck=0;
	static String letter="";
	static String checkToss="";
	static int head=0;
	static int tail=1;
	
	//Declaring 2D array for getting board.
	static int[][] arrayBoard=new int[3][3];
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
	private static String getToss() 
	{
		randomCheck=getRandomNumber();
		if(randomCheck==head)
		{
			return "You won the toss congratulations go ahead now....";
		}
		else
		{
			return "You lost the toss wait for your turn.... ";
		}
	}		
	
	//To display array as board.
	private static void arrayDisplay()
	{
		for (int i = 0; i < arrayBoard.length; i++) 
		{
			for (int j = 0; j < arrayBoard.length; j++) 
			{
				System.out.print(arrayBoard[i][j]+" ");	
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		arrayDisplay();
		letter=getLetter();
		System.out.println(letter);
		checkToss=getToss();
		System.out.println(checkToss);
		
	}

	

}
