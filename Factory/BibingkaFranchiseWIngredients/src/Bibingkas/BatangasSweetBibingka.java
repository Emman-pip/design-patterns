package src.Bibingkas;

import src.Bibingkas.*;
import src.IngredientFactories.BatangasIngredientFactory;
import src.IngredientFactories.IngredientFactory;

/**
 * BatangasSweetBibingka
 */
public class BatangasSweetBibingka extends Bibingka {
	public BatangasSweetBibingka(IngredientFactory ingredientFactory) {
		super(ingredientFactory);
		this.type = "sweet";
		this.name = "Batangas sweet bibingka";
	}
}
