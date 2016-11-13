package dojoStringSplitter;

/*
 * Vágja el azokat a szavakat amelyek karaktereinek száma nagyobb min a megadott sorhossz, azon szavakat amelyek
 * egyébként
 * kiférnének egy sorba azt írja egy új sorba.
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

		String text = "Apacuka fundaluka fundakávé kamanduka apcuk funda luk funda kávé kamanduk.";
		int rowLength = 8;

		StringSplitter2 textWrapper = new StringSplitter2();
		String wrappedText = textWrapper.StringSplitterHard(text, rowLength);
		System.out.println(wrappedText);
	}
}
