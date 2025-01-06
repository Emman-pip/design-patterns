package src.Sauces;

import java.util.ArrayList;

/**
 * Sauce
 */
public abstract class Sauce {
	protected ArrayList<String> ingredients = new ArrayList<String>();

	protected String name;

	public String getName() {
		return name;
	}

	public ArrayList<String> getIngredients() {
		return ingredients;
	}
}
