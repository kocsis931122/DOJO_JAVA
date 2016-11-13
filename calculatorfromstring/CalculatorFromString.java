package calculatorfromstring;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class CalculatorFromString
{
	public static int calculate(String input) throws Exception
	{
		if (input == null || input.equals(""))
		{
			throw new Exception("invalid input");
		}
		String formed = input.replaceAll(" ", "").replaceAll("\t", "");
		StringTokenizer st = new StringTokenizer(formed, "+-", true);
		int result = 0;
		int factor = 1;
		while (st.hasMoreTokens())
		{
			String string = st.nextToken();
			if (string.equals("-"))
			{
				factor = -1;
			}
			else if (string.equals("+"))
			{
				factor = 1;
			}
			else
			{
				int value = Integer.parseInt(string);
				result += factor * value;
			}
		}
		return result;
	}

//	public static int calculate(String input)
//	{
//		String formed = input.replaceAll(" ", "").replaceAll("\t", "");
//		char[] delimiters = { '+', '-', '*' };
//		String[] splitted = split(formed, delimiters);
//		int result = 0;
//		int factor = 1;
//		int prevValue = 0;
//		int afterValue = 0;
//		for (int i = 0; i < splitted.length; i++)
//		{
//			if (splitted[i + 1].equals("*"))
//			{
//				prevValue = Integer.parseInt(splitted[i - 1]);
//				afterValue = Integer.parseInt(splitted[i + 1]);
//				splitted[i] = String.valueOf(prevValue * afterValue);
//				prevValue = 0;
//				afterValue = 0;
//			}
//
//			else if (splitted[i].equals("-"))
//			{
//				factor = -1;
//			}
//			else if (splitted[i].equals("+"))
//			{
//				factor = 1;
//			}
//
//			else
//			{
//				int value = Integer.parseInt(splitted[i]);
//				result += factor * value;
//			}
//		}
//		return result;
//	}

	public static String[] split(String input, char[] delimiters)
	{
		String[] splitted = null;
		List<String> stringList = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length(); i++)
		{
			if (isInArray(delimiters, input.charAt(i)))
			{
				if (sb.length() > 0)
				{
					stringList.add(sb.toString());
					sb.setLength(0);
				}
				stringList.add(String.valueOf(input.charAt(i)));
			}
			else
			{
				sb.append(input.charAt(i));
			}
		}
		if (sb.length() > 0)
		{
			stringList.add(sb.toString());
		}
		splitted = (String[]) stringList.toArray(new String[stringList.size()]);
		return splitted;
	}

	public static boolean isInArray(char[] chars, char key)
	{
		for (char c : chars)
		{
			if (key == c)
			{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args)
	{
		try
		{
			int result = calculate("-1 - 20 + 3    +3");
			System.out.println(result);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}