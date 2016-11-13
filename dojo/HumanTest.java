package dojo;

import java.util.ArrayList;
import java.util.List;

import dojo.Human.Gender;

public class HumanTest {

	public static void main(String[] args) {
		Human pony = new Human(110, "Pinkie", Gender.FEMALE, 8);
		Human ember = new Human(170, "Béla", Gender.MALE, 48);
		Human tehen = new Human(191, "Riska", Gender.FEMALE, 18);
		List<Human> farm = new ArrayList<Human>();
		farm.add(pony);
		farm.add(tehen);
		farm.add(0, ember);

		for (Human human : farm) {
			System.out.println(human);
		}
		System.out.println();
		for (int i = 0; i < farm.size(); i++) {
			Human human = farm.get(i);
			System.out.println(human);
		}
	}
}
