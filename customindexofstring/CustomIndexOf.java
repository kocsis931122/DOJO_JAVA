package customindexofstring;

import java.util.Arrays;

public class CustomIndexOf
{
	public static int indexOf(String string, int startIndex, char ch)
	{
		for (int i = startIndex; i < string.length(); i++)
		{
			if (string.charAt(i) == ch)
			{
				return i;
			}
		}
		return -1;
	}

	public static int indexOf(String string, char ch)
	{
		return indexOf(string, 0, ch);
	}

	public static int[] insert(int[] array, int index, int insertedNumber)
	{
		int[] result = new int[array.length + 1];
		for (int i = 0; i < result.length; i++)
		{
			if (i < index)
				result[i] = array[i];
			if (i == index)
				result[i] = insertedNumber;
			if (i > index)
				result[i] = array[i - 1];
		}
		return result;
	}

	public static void main(String[] args)
	{
		int[] array = { 3, 4, 5, 7, 2 };
		int[] result = insert(array, 2, 155);
		System.out.println(Arrays.toString(result));
	}
}
