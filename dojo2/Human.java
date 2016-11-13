package dojo2;

import java.io.Serializable;

public class Human implements Serializable {

	private static final long serialVersionUID = -2347395592612618427L;
	String name;
	int age;
	double height;
	double weight;

	public Human(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
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

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Name: " + name + " Age: " + age + " Height: " + height;
	}

	@Override
	public int hashCode() {
		System.out.println(super.hashCode());
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		Human other = (Human) obj;
		return name.equals(other.getName());
	}
}
