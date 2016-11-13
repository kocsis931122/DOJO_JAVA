package codewars;

public class TwoFightersOneWinners {
	public String name;
	public int health, damagePerAttack;

	public TwoFightersOneWinners(String name, int health, int damagePerAttack) {
		this.name = name;
		this.health = health;
		this.damagePerAttack = damagePerAttack;
	}

	public static String declareWinner(TwoFightersOneWinners fighter1, TwoFightersOneWinners fighter2,
			String firstAttacker) {
		String winner = "";
		while (fighter1.health > 0 && fighter2.health > 0) {
			if (firstAttacker == fighter1.name) {
				fighter2.health -= fighter1.damagePerAttack;
				if (fighter2.health <= 0) {
					winner = fighter1.name;
					break;
				} else {
					fighter1.health -= fighter2.damagePerAttack;
					winner = fighter2.name;
				}
			} else {
				fighter1.health -= fighter2.damagePerAttack;
				if (fighter1.health <= 0) {
					winner = fighter2.name;
					break;
				} else {
					fighter2.health -= fighter1.damagePerAttack;
					winner = fighter1.name;
				}
			}
		}
		return winner;

	}

	public static void main(String[] args) {
		TwoFightersOneWinners peti = new TwoFightersOneWinners("Peti", 30, 3);
		TwoFightersOneWinners vitya = new TwoFightersOneWinners("Vitya", 20, 5);
		System.out.println(TwoFightersOneWinners.declareWinner(peti, vitya, "Peti"));

	}

}
