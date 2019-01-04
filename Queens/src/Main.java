import java.util.Arrays;
import java.util.Scanner;

public class Main extends Board {
	
	public static void main(String args[])
	{	
		System.out.println("Enter x");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
			
		System.out.println("Enter y");
		Scanner sc2 = new Scanner(System.in);
		int y = sc2.nextInt();
		sc.close();
		sc2.close();
			
		char board[][] = new char[8][8];
			
		for(int i = 0; i < N; i ++)
		{
			Arrays.fill(board[i], '-');
		}
		printSolution(board, 0, x, y);
	}
}	


