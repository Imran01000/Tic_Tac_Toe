import java.util.*;
public class TicTacToe {
	static int[][] arrayBoard=new int[3][3];
	public static void main(String[] args)
	{
		for (int i = 0; i < arrayBoard.length; i++) {
			for (int j = 0; j < arrayBoard.length; j++) {
				System.out.print(arrayBoard[i][j]+" ");	
			}
			System.out.println();
		}
	
	}
}
