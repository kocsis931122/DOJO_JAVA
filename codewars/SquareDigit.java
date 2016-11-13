package codewars;

public class SquareDigit {
	public int squareDigits(int n) {
		 String resStr = "";
		    
		    while(n!=0)
		    {
		      int rem = n%10;
		      resStr = rem*rem + resStr;
		      n=n/10;
		    }
		      return Integer.parseInt(resStr);
	}
}
