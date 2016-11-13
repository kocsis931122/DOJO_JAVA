package dojo;

import java.awt.Color;

public class VehicleTest {
	static class Engineer {
		public static boolean canRepair(Vehicle v) {
			if (v instanceof Car) {
				return true;
			} else if (v instanceof Airplane) {
				System.out.println("We entered into our else tag");
				return false;
			}
			return false;
		}
	}

	public static void main(String[] args) {
		Color color = Color.blue;
		Vehicle c1 = new Car(color, Fuel.DIESEL, "Audi", 181, 12.2);
		c1.run();

		Vehicle c2 = new Airplane();
		c2.run();
		System.out.println(Engineer.canRepair(c1));
		System.out.println(Engineer.canRepair(c2));
	}
}
