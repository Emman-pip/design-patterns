package src;

import src.Stores.BatangasStore;
import src.Stores.BibingkaStore;
import src.IngredientFactories.*;

/**
 * Main
 */
public class Main {
	public static void main(String[] args) {
		BibingkaStore batangas = new BatangasStore();
		IngredientFactory bif = new BatangasIngredientFactory();
		batangas.setIngredientFactory(bif);
		batangas.order("sweet");
		batangas.order("chili");
	}
}
