package pascaltriangle;

import java.util.Arrays;

public class Pascal
{
	// 1
	// 1 1
	// 1 2 1
	// 1 3 3 1
	// 1 4 6 4 1

	public static int[][] generate(int row)
	{
		if (row <= 0)
		{
			System.out.println("A sor nem lehet kisebb nullánál.");
			return null;

		}
		int[][] result = new int[row][];
		result[0] = new int[] { 1 };
		for (int i = 1; i < result.length; i++)
		{
			int[] rowArray = new int[i + 1];
			for (int j = 0; j < rowArray.length; j++)
			{
				if (j == 0 || j == rowArray.length - 1)
				{
					rowArray[j] = 1;
				}
				else
				{
					rowArray[j] = result[i - 1][j] + result[i - 1][j - 1];
				}
			}
			result[i] = rowArray;
		}
		return result;
	}

	public static void main(String[] args)
	{
		int[][] tomb = generate(10);
		for (int i = 0; i < tomb.length; i++)
		{
			System.out.println(Arrays.toString(tomb[i]));
		}
	}
}
