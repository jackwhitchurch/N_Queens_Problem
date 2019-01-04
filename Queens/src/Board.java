public class Board {
	
	static final int N = 8;
	static int solutions = 1;
	
	static boolean toPlaceOrNotToPlace(char theBoard[][], int row, int col, int x, int y)
	{
		for(int i = 0; i< row; i++)   
		{
			if(theBoard[i][col] == 'Q')
			return false;		
		}	
		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--)
		{
			if (theBoard[i][j] == 'Q')
			return false;
		}
	    for (int i = row, j = col; i >= 0 && j < N; i--, j++)
	    {
	    	if (theBoard[i][j] == 'Q')
	    	return false;
	    }
	    return true;
	}
		
	protected static void printSolution(char board[][], int row, int x, int y)
	{ 
		int xtest = x;
		int ytest = y;
		if(row == N)
		{
			if(board[xtest][ytest] == 'Q')
			{
				System.out.println("This is solution number: " + solutions);
				for (int i = 0; i < N; i++)
				{
					for (int j = 0; j < N; j++)
					{
						System.out.print(board[i][j] + " ");		
					}	
					System.out.println();	
				}	
				System.out.println();
				solutions++;
			}	
		}
		
		for(int i = 0; i < N; i ++)
		{
			if (toPlaceOrNotToPlace(board, row, i, x, y))
	            {
	                board[row][i] = 'Q';
	                printSolution(board, row + 1, x, y);
	                board[row][i] = '-';       
	            }   
	    }
	}
}