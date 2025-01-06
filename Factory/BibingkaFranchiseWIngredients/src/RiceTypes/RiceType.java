package src.RiceTypes;

import java.util.ArrayList;

/**
 * RiceType
 */
public abstract class RiceType {
	protected String name;

	public String getName() {
		return name;
	}

	protected ArrayList<String> ingredients = new ArrayList<String>();

	public ArrayList<String> getIngredients() {
		return ingredients;
	}
}
