package human;

public class Person implements Comparable<Person> {
	String name;
	int age;
	double height;
	Gender gender;

	public Person(String name, int age, double height, Gender gender) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", height=" + height + ", gender=" + gender + "]";
	}

	@Override
	public int hashCode() {
		return -1;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person) {
			return ((Person) obj).getAge() == age;
		}
		return false;
	}

	@Override
	public int compareTo(Person o) {
		return name.compareTo(o.getName());
	}

}
