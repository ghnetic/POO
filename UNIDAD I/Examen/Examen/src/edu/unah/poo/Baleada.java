package edu.unah.poo;

import java.util.ArrayList;
import java.util.List;

public abstract class Baleada extends AbstractFood{
	private String name= "Baleada";
	private int calories=0;
	private int price=0;
	
	List <Ingredient> ingredientes= new ArrayList<Ingredient>();

	public Baleada() {
		super();
		// TODO Auto-generated constructor stub
	}

	public void addIngredient(Ingredient ingredient) {
		ingredientes.add(ingredient);
	}

	public String getName() {
		return name+ingredientes;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCalories() {
		return calories;
	}

	public void setCalories(int calories) {
		this.calories = calories;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Ingredient> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(List<Ingredient> ingredientes) {
		this.ingredientes = ingredientes;
	}
	
	
	
	
}
