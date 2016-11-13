package dojo2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class HumanHandler {

	public static void main(String[] args) {
		Human jozsi = new Human("Jozsi", 25, 1.80, 80);
		Human mari = new Human("Mari", 26, 1.90, 80);
		Human pisti = new Human("Pisti", 25, 1.80, 80);
		Human jozsi2 = new Human("Jozsi", 25, 1.80, 80);
		// Hashset-ben nincs duplikáció, ahogy a Hashmapnál sincs.
		Set<Human> humanSet = new HashSet<>();
		humanSet.add(jozsi);
		humanSet.add(mari);
		humanSet.add(pisti);
		humanSet.add(jozsi2);

		Map<Human, Integer> humanMap = new HashMap<>();
		humanMap.put(jozsi, 1);
		humanMap.put(mari, 2);
		humanMap.put(pisti, 3);
		humanMap.put(jozsi2, 4);

		List<Human> humanList = new ArrayList<>();
		humanList.add(jozsi);
		humanList.add(mari);
		humanList.add(pisti);
		humanList.add(jozsi2);
		System.out.println("index: " + humanList.indexOf(jozsi2));
		/*
		 * for (Human human : humanMap.keySet()) {
		 * System.out.println(human.getName() + " Value: " +
		 * humanMap.get(human)); // Felülírja az értéket }
		 */

		// System.out.println(humanSet.size());
	}

}
