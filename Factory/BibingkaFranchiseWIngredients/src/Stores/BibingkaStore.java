package src.Stores;

import src.Bibingkas.Bibingka;
import src.IngredientFactories.IngredientFactory;

import java.util.ArrayList;

/**
 * BibingkaStore
 */
public abstract class BibingkaStore {
	protected IngredientFactory ingredientFactory = null;

	public void setIngredientFactory(IngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	public void order(String type) {
		Bibingka bibingka = createBibingka(type);
		prep(bibingka);
		box(bibingka);
		slice(bibingka);
	}

	public abstract Bibingka createBibingka(String type);

	public void slice(Bibingka bibingka) {
		System.out.println("slicing " + bibingka.getName() + " a " + bibingka.getType() + " bibingka to pieces!");
	}

	public void box(Bibingka bibingka) {
		System.out.println("Putting " + bibingka.getName() + " a " + bibingka.getType() + " bibingka to a pretty box!");
	}

	private void readIngredients(ArrayList<String> arr) {
		for (String item : arr) {
			System.out.println("\titem");
		}
		System.out.println();
	}

	public void prep(Bibingka bibingka) {
		System.out.println("Preparing " + bibingka.getName() + ", " + bibingka.getType() + "...");
		System.out.println("Preparing rice: " + bibingka.getRiceType().getName());
		readIngredients(bibingka.getRiceType().getIngredients());
		System.out.println("Preparing Sauce: " + bibingka.getSauce().getName());
		readIngredients(bibingka.getSauce().getIngredients());
		System.out.println("Preparing Toppings: " + bibingka.getToppings().getName());
		readIngredients(bibingka.getToppings().getIngredients());
	}
}
