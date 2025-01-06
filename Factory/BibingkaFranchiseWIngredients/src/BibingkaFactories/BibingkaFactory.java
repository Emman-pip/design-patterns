package src.BibingkaFactories;

import src.Bibingkas.*;
import src.IngredientFactories.*;

/**
 * BibingkaFactory
 */
public abstract class BibingkaFactory {
	public abstract Bibingka createBibingka(String type, IngredientFactory ingredientFactory);
}
