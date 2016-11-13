package charswapper;

/*
 * van egy konstans ami karaktereket tartalmaz , m�sik konstans ugyanolyan hossz� �s karakterket tartalmaz(t�mb)
 * met�dus ami kap egy stringet �s azokat a karaktereket amiket megtal�l az els� konstansban sztringel t�r vissza
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
