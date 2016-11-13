package hundreddoors;

import java.util.ArrayList;
import java.util.List;

public class HundredDoors
{

	public void printOpenDoors()
	{
		boolean doorState = false;
		List<Boolean> doorsList = new ArrayList<>();
		for (int i = 1; i <= 101; i++)
		{
			doorsList.add(doorState);
		}

		for (int i = 1; i <= doorsList.size(); i++)
		{
			for (int j = 1; j < doorsList.size() + 1; j += i)
			{
				if (doorsList.get(j - 1) == true)
				{
					// System.out.println(j);
					doorsList.set(j - 1, false);
				}
				else
				{
					// System.out.println(j);
					doorsList.set(j - 1, true);
				}
				// System.out.println(j);
			}
			System.out.println(doorsList.get(99));
			// System.out.println(i);
			// System.out.println(doorsList.get(i));
		}

		for (int i = 1; i < doorsList.size(); i++)
		{
			if (doorsList.get(i) == true)
			{
				System.out.println(i);
			}
		}

	}

	public int reverseNumber(int number)
	{
		String numb = String.valueOf(number);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < numb.length(); i++)
		{
			sb.append(numb.charAt(numb.length() - 1 - i));
		}
		return Integer.parseInt(sb.toString());

	}

	public static void main(String[] args)
	{
		HundredDoors hd = new HundredDoors();
		hd.printOpenDoors();
		int number = 123;
//		System.out.println(hd.reverseNumber(number));
	}
}