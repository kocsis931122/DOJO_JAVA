package bubblesort;

import java.util.Arrays;

public class BubbleSort
{
	int[] list;

	public BubbleSort(int[] list)
	{
		this.list = list;
	}

	public int[] sort()
	{
		boolean wasSwap = true;
		while (wasSwap)
		{
			wasSwap = false;
			for (int i = 0; i < list.length - 1; i++)
			{
				if (list[i] > list[i + 1])
				{
					int temp = list[i];
					list[i] = list[i + 1];
					list[i + 1] = temp;
					wasSwap = true;
				}
			}
		}
		return list;
	}

	public static void main(String[] args)
	{
		int[] numbers = { 1, 5, 2, 7, -12, 0, 13, 6 };
		// int a = 2;
		// int b = 3;
		// a = a + b; //a = 5, b = 3
		// b = a - b; //a = 5, b = 2
		// a = a - b; //a = 3, b = 2
		// With bitwise operation:
		// a = b ^ b; 10 ^ 11 = 01
		// b = b ^ a; 11 ^ 01 = 10
		// a = a ^ b; 01 ^ 10 = 11
		BubbleSort bs = new BubbleSort(numbers);
		int[] sorted = bs.sort();
		System.out.println(Arrays.toString(sorted));

	}
}
