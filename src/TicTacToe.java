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
	static boolean isCellEmpty;
	static int flag=0;
	
	//Declaring 2D array for getting board.
	static char[][] arrayBoard=new char[3][3];
	
	//Using Random class to generate random numbers.
	static Random r=new Random();
	
	//Using scanner class to get desire input.
	static Scanner sc=new Scanner(System.in);
	
	//To generate random number.;
	private static int getRandomNumber() {
		random=r.nextInt(2);
		return random;
		
	}
	
	//To know the letter X or O is assign to me.
	private static String getLetter() 
	{
		randomCheck=getRandomNumber();
		if(randomCheck==head)
		return "Your competitor ahead with 'O'";
		else	
		return "You will ahead with 'X'";
		
	};
	
	//To get the toss result.
	private static int getToss() 
	{
		randomCheck=getRandomNumber();
		if(randomCheck==head)
		{
			System.out.println("You won the toss congratulations go ahead now....");
		    return 0;
		}
		else
		{
			System.out.println("You lost the toss wait for your turn.... ");
			return 1;
		}
	}	
	
	//To display array as board.
	private static void arrayDisplay(char[][] arrayBorad)
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
					System.out.print("-"+" ");
				}
			}
			System.out.println();
		}
	}
	
	private static void computerUser(int i,int j)
	{
		if(arrayBoard[i][j]=='X' || arrayBoard[i][j]=='O')
			System.out.println("Sorry this place is already occupied..");
		else
			arrayBoard[i][j]='O';
		
		arrayDisplay(arrayBoard);;
		System.out.println();
		
			
		
	}
	private static void user(int i,int j)
	{
		if(arrayBoard[i][j]=='X' || arrayBoard[i][j]=='O')
		System.out.println("Sorry this place is already occupied..");
		else
		arrayBoard[i][j]='X';
		
		arrayDisplay(arrayBoard);
		System.out.println();

	}
	
	private static void  playGame(int checkToss)
	{
		if(checkToss==head)
		{
			System.out.println("Enter i and j values to get cell postion");
			i=sc.nextInt();
			j=sc.nextInt();
			user(i,j);
		}
		else if(checkToss==tail)
		{

			randomI=r.nextInt(3);
			randomJ=r.nextInt(3);
			i=randomI;
			j=randomJ;
			computerUser(i,j);
		}
	}
	public static void main(String[] args)
	{
		
			letter=getLetter();
			System.out.println(letter);
			checkToss=getToss();
			playGame(checkToss);
			System.out.println();
			int n=0;
			while( n < 9 )
			{
				if(checkToss==tail)
				{
					System.out.println("Enter i and j values between( 0 to 2) to get cell postion");
					i=sc.nextInt();
					j=sc.nextInt();
					user(i,j);
					checkToss=head;
					System.out.println();
				}
				else if(checkToss==head)
				{
					randomI=r.nextInt(3);
					randomJ=r.nextInt(3);
					i=randomI;
					j=randomJ;
					computerUser(i,j);
					checkToss=tail;
					System.out.println();
				}	
				n++;
	
			}					
	}
}
