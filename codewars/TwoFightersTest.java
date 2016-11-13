package codewars;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TwoFightersTest {
	@Test
	public void basicTests() {
		assertEquals("Lew", TwoFightersOneWinners.declareWinner(new TwoFightersOneWinners("Lew", 10, 2),
				new TwoFightersOneWinners("Harry", 5, 4), "Lew"));
		assertEquals("Harry", TwoFightersOneWinners.declareWinner(new TwoFightersOneWinners("Lew", 10, 2),
				new TwoFightersOneWinners("Harry", 5, 4), "Harry"));
		assertEquals("Harald", TwoFightersOneWinners.declareWinner(new TwoFightersOneWinners("Harald", 20, 5),
				new TwoFightersOneWinners("Harry", 5, 4), "Harry"));
		assertEquals("Harald", TwoFightersOneWinners.declareWinner(new TwoFightersOneWinners("Harald", 20, 5),
				new TwoFightersOneWinners("Harry", 5, 4), "Harald"));
		assertEquals("Harald", TwoFightersOneWinners.declareWinner(new TwoFightersOneWinners("Jerry", 30, 3),
				new TwoFightersOneWinners("Harald", 20, 5), "Jerry"));
		assertEquals("Harald", TwoFightersOneWinners.declareWinner(new TwoFightersOneWinners("Jerry", 30, 3),
				new TwoFightersOneWinners("Harald", 20, 5), "Harald"));
	}
}