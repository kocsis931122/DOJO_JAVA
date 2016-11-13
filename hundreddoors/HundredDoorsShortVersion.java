package hundreddoors;

public class HundredDoorsShortVersion
{

	public static void main(String[] args)
	{
		for (int i = 0; i < 15; i++)
		{
			int number = (int) (Math.random() * 3);
			System.out.print(number + " ");
		}
		for (int i = 0; i < 10; i++)
			System.out.println("Door #" + (i * (i + 2) + 1) + " is open.");
	}

}
