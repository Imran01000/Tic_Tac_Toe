import java.util.*;
public class TicTacToe {
	
	//Declaring 2D array for getting board.
	static int[][] arrayBoard=new int[3][3];
	static Random r=new Random();
	
	//To know the if letter X or O is assigned to me.
	private static String getLetter() 
	{
		int randomCheck=r.nextInt(2);
		if(randomCheck==0)
		return "you will ahead with 'O'";
		else
		return "You will ahead with 'X'";
		
	}
	public static void main(String[] args)
	{
		for (int i = 0; i < arrayBoard.length; i++) 
		{
			for (int j = 0; j < arrayBoard.length; j++) 
			{
				System.out.print(arrayBoard[i][j]+" ");	
			}
			System.out.println();
		}
		String letter=getLetter();
		System.out.println(letter);
		
	}

}
