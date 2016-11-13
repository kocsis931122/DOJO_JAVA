package codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class SquareDigitTest {

	@Test
	public void test() {
		assertEquals(811181, new SquareDigit().squareDigits(9119));
	}

}
