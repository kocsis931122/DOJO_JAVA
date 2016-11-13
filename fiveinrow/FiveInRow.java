package fiveinrow;

public class FiveInRow
{
	static final int[][]	DIRECTIONS	= new int[][] { { 0, 1 }, { 1, -1 }, { 1, 0 }, { 1, 1 }, };
	static char[][]			fiveInRow	= new char[][] {
	                                            { '.', '.', '.', 'O', '.', '.', '.', '.', '.', '.' },
	                                            { '.', '.', 'X', 'O', '.', '.', '.', '.', '.', '.' },
	                                            { '.', '.', 'X', 'X', '.', 'O', '.', '.', '.', '.' },
	                                            { '.', '.', 'X', 'X', 'O', 'X', 'X', '.', '.', '.' },
	                                            { '.', 'X', 'O', 'O', 'O', 'O', 'O', 'O', '.', '.' },
	                                            { '.', '.', 'O', 'X', 'O', 'O', 'O', '.', '.', '.' },
	                                            { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
	                                            { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
	                                            { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' },
	                                            { '.', '.', '.', '.', '.', '.', '.', '.', '.', '.' }, };

	public static boolean endChecker(char[][] array)
	{
		for (int i = 0; i < array.length; i++)
		{
			for (int j = 0; j < array[i].length; j++)
			{
				if (array[i][j] == 'X')
				{
					if (countNeighbour(i, j))
						return true;

				}
			}
		}

//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array[i].length; j++) {
//				if (array[i][j] == 'X') {
//					countX++;
//					countO = 0;
//				}
//				if (array[i][j] == 'O') {
//					countO++;
//					countX = 0;
//				}
//				if(array[i][j] == '.'){
//					countX = 0;
//					countO = 0;
//				}
//				
//			}
		return false;
	}

	public static boolean countNeighbour(int i, int j)
	{
		int count = 0;
		for (int[] dir : DIRECTIONS)
		{
			for (int k = 1; k < 5; k++)
			{
				int di = i + (dir[0] * k);
				int dj = j + (dir[1] * k);
				if (di >= 0 && di < fiveInRow.length && dj >= 0 && dj < fiveInRow[di].length)
				{
					if (fiveInRow[di][dj] == 'X' || fiveInRow[di][dj] == 'O')
					{
						count++;

					}
				}

			}
			if (count == 4)
			{
				return true;
			}
			count = 0;
		}
		return false;
	}

	public static void main(String[] args)
	{
		System.out.println(endChecker(fiveInRow));
	}
}
