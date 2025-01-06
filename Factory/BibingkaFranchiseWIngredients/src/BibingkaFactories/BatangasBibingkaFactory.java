package src.BibingkaFactories;

import src.Bibingkas.*;
import src.IngredientFactories.IngredientFactory;

/**
 * BatangasBibingkaFactory
 */
public class BatangasBibingkaFactory extends BibingkaFactory {
	public Bibingka createBibingka(String type, IngredientFactory ingredientFactory) {
		Bibingka bibingka = null;
		if (type.equals("sweet")) {
			bibingka = new BatangasSweetBibingka(ingredientFactory);
		}

		return bibingka;
	}

}
