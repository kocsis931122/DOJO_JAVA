package dojo;

import java.util.ArrayList;
import java.util.List;

public class Human {
	public enum Gender {
		MALE, FEMALE
	}

	int height;
	String name;
	Gender gender;
	int age;

	public Human(int height, String name, Gender gender, int age) {
		this.height = height;
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

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

	public String toString() {
		return "Name: " + name + "\nHeight: " + height + "\nGender: " + gender + "\nAge: " + age;
	}
}
