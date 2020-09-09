package edu.unah.poo;

public class Carne extends Ingredient{
	
	public Carne(String name, int price, int calories) {
		super(name, price, calories);
		}

	@Override
	public String getName() {
		return "carne";
	}

	@Override
	public int getCalories() {
		return 15;
	}

	@Override
	public int getPrice() {
		return 5;
	}

}
