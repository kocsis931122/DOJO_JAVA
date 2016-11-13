package dojo;

import java.awt.Color;

public class Car implements Vehicle {
	Color color;
	Fuel fuel;
	String manufacturer;
	int maxSpeed;
	double zeroToHundred;

	public Car(Color color, Fuel fuel, String manufacturer, int maxSpeed, double zeroToHundred) {
		this.color = color;
		this.fuel = fuel;
		this.manufacturer = manufacturer;
		this.maxSpeed = maxSpeed;
		this.zeroToHundred = zeroToHundred;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Fuel getFuel() {
		return fuel;
	}

	public void setFuel(Fuel fuel) {
		this.fuel = fuel;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public double getZeroToHundred() {
		return zeroToHundred;
	}

	public void setZeroToHundred(double zeroToHundred) {
		this.zeroToHundred = zeroToHundred;
	}

	public String toString() {
		return "Color: " + colorToString(color) + "\nFuel: " + fuel + "\nManufacturer: " + manufacturer + "\nMaxSpeed: "
				+ maxSpeed + "\nZeroToHundred: " + zeroToHundred;

	}

	public String colorToString(Color color) {
		return "Red is: " + color.getRed() + "; Blue is: " + color.getBlue() + "; Green is: " + color.getGreen();
	}

	public static void main(String[] args) {
		Color color = Color.blue;
		Car car = new Car(color, Fuel.DIESEL, "Audi", 181, 12.2);
		System.out.println(car);
	}

	@Override
	public void run() {
		System.out.println("The car is running.");
	}
}
