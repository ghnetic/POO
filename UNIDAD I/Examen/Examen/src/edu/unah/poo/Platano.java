package edu.unah.poo;

public class Platano extends Ingredient{

	public Platano(String name, int price, int calories) {
		super(name, price, calories);
			}

	@Override
	public String getName() {
		return "Platano";
	}

	@Override
	public int getCalories() {
		return 194;
	}

	@Override
	public int getPrice() {
		return 2;
	}

}
