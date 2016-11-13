package printer;

public class Printer
{

	String				valid		= "abcdefghijklm";
	final static char[]	KOREANCASE	= new char[] { 'a', 'h', 'z', 'w', 'q' };

	private void printError(String str)
	{
		int count = 0;

		for (int i = 0; i < str.length(); i++)
		{
			if (valid.contains(String.valueOf(str.charAt(i))))

			{
				count++;

			}

		}
		System.out.println(count + "/" + (str.length() - count));

	}

	private String printControlChars(String str)
	{
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < str.length(); i++)
		{
			if (valid.contains(String.valueOf(str.charAt(i))))
			{
				sb.append(str.charAt(i));
			}

		}
		return sb.toString();
	}

	private String printKoreanControlChars(String str)
	{
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++)
		{
			if (contains(KOREANCASE, str.charAt(i)))
			{
				sb.append(str.charAt(i));

			}

		}
		return sb.toString();

	}

	public String print(String str, boolean isKorean)
	{
		return isKorean ? printKoreanControlChars(str) : printControlChars(str);

	}

	public boolean contains(char[] arr, char ch)
	{
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] == ch)
			{
				return true;
			}

		}

		return false;
	}

	public static void main(String[] args)
	{
		Printer p = new Printer();
		p.printError("abcdefghijklm");
		String result = p.printControlChars("aaxybyccc");
		System.out.println(result);

		String result2 = p.printKoreanControlChars("aagghhww");
		System.out.println(result2);
		String result3 = p.print("aahhyyzz", true);
		String result4 = p.print("abcdefefe", false);

		System.out.println(result3);
		System.out.println(result4);
		System.out.println(p.contains(KOREANCASE, 'a'));

	}

}
