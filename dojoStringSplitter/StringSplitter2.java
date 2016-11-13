package dojoStringSplitter;

/*
 * V�gja el azokat a szavakat amelyek karaktereinek sz�ma nagyobb min a megadott sorhossz, azon szavakat amelyek
 * egy�bk�nt
 * kif�rn�nek egy sorba azt �rja egy �j sorba.
 * Pl.(7es sorhossz):
 * kamandu
 * ka
 * a kuka
 * makika
 */
public class StringSplitter2
{

	public String StringSplitterHard(String text, int rowLength)
	{
		StringBuilder stringBuilder = new StringBuilder();
		String[] words = text.split(" ");

		int charsInRow = 0;
		for (String word : words)
		{
			if (charsInRow + word.length() > rowLength)
			{
				stringBuilder.append("\n");
				charsInRow = 0;
			}

			for (int i = 0; i < word.length() / rowLength; i++)
			{
				stringBuilder.append(word.substring(i * rowLength, (i + 1) * rowLength));
				stringBuilder.append('\n');
				charsInRow = 0;
			}

			word = word.substring(word.length() - (word.length() % rowLength));

			stringBuilder.append(word);
			charsInRow += word.length();

			if (charsInRow + 1 <= rowLength && charsInRow > 0)
			{
				stringBuilder.append(" ");
				charsInRow++;
			}

		}

		return stringBuilder.toString();
	}

	public static void main(String[] args)
	{

		String text = "Apacuka fundaluka fundak�v� kamanduka apcuk funda luk funda k�v� kamanduk.";
		int rowLength = 8;

		StringSplitter2 textWrapper = new StringSplitter2();
		String wrappedText = textWrapper.StringSplitterHard(text, rowLength);
		System.out.println(wrappedText);
	}
}
