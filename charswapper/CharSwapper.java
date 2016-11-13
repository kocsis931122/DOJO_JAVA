package charswapper;

/*
 * van egy konstans ami karaktereket tartalmaz , másik konstans ugyanolyan hosszú és karakterket tartalmaz(tömb)
 * metódus ami kap egy stringet és azokat a karaktereket amiket megtalál az elsõ konstansban sztringel tér vissza
 */
public class CharSwapper
{
	static final char[]	firstCharArray	= { 'a', 'b', 'c', 'd', 'e', 'f' };
	static final char[]	secondCharArray	= { 'f', 'f', 'f', 'f', 'f', 'f' };

	public static String swapper(String text)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < text.length(); i++)
		{
			char actualChar = text.charAt(i);
			for (int j = 0; j < firstCharArray.length; j++)
			{
				if (firstCharArray[i] == actualChar)
				{
					actualChar = secondCharArray[j];
				}
			}
			sb.append(actualChar);
		}
		return sb.toString();
	}

	public static void main(String[] args)
	{
		String text = "alma";
		System.out.println(swapper(text));
	}
}
