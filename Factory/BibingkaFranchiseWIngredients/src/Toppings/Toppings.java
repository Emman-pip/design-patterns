package src.Toppings;

import java.util.ArrayList;

/**
 * Toppings
 */
public abstract class Toppings {
	protected String name;

	public String getName() {
		return name;
	}

	protected ArrayList<String> ingredients = new ArrayList<String>();

	public ArrayList<String> getIngredients() {
		return ingredients;
	}
}
