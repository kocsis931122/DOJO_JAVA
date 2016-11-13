package getNeighbours;

import java.util.ArrayList;
import java.util.List;

public class GetNeighbours
{
	static final int[][]	DIRECTIONS	= new int[][] {
	                                            { -1, -1 }, { -1, 0 }, { -1, 1 }, { 0, -1 }, { 0, 1 }, { 1, -1 },
	                                            { 1, 0 },
	                                            { 1, 1 } };
	int[][]					field		= new int[][] {
	                                            { 1, 4, 6, 7, 5, 10 }, { 2, 3, 9 }, { 10 }, { 12, 20, 41, 34 },
	                                            { 8, 15, 17 }, };

	public int[] toIntArray(List<Integer> resultList)
	{
		int[] resultArray = new int[resultList.size()];
		for (int i = 0; i < resultArray.length; i++)
		{
			resultArray[i] = resultList.get(i);
		}
		return resultArray;
	}

	public int[] getNeighbours(int i, int j)
	{
		List<Integer> resultList = new ArrayList<>();
		for (int[] dir : DIRECTIONS)
		{
			int di = i + dir[0];
			int dj = j + dir[1];
			if (di >= 0 && dj >= 0 && di < field.length && dj < field[di].length)
			{
				resultList.add(field[di][dj]);
			}
		}
		return toIntArray(resultList);
	}

	public static void main(String[] args)
	{
		GetNeighbours nb = new GetNeighbours();
		int[] result = nb.getNeighbours(1, 1);
		for (int is : result)
		{
			System.out.println(is);
		}
	}
}
