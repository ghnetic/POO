package edu.unah.poo;

public class Aguacate extends Ingredient{

	public Aguacate(String name, int price, int calories) {
		super(name, price, calories);
	}

	@Override
	public String getName() {
		return "aguacate";
	}

	@Override
	public int getCalories() {
		return 495;
	}

	@Override
	public int getPrice() {
		return 5;
	}

}
