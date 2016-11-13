package human;

import java.util.Comparator;

public class HeightComparator implements Comparator<Person> {

	@Override
	public int compare(Person o1, Person o2) {
		if (o1.getHeight() < o2.getHeight()) {
			return -1;
		}
		if (o1.getHeight() > o2.getHeight()) {
			return 1;
		}
		return 0;
		// return (int) (1000 * (o1.getHeight() - o2.getHeight()));
	}

}
