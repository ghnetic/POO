package edu.unah.poo;

public class Huevo extends Ingredient{

	public Huevo(String name, int price, int calories) {
		super(name, price, calories);
		}

	@Override
	public String getName() {
		return "huevo";
	}

	@Override
	public int getCalories() {
		return 299;
	}

	@Override
	public int getPrice() {
		return 1;
	}

}
