package src.Stores;

import src.BibingkaFactories.BatangasBibingkaFactory;
import src.Bibingkas.*;
import src.Toppings.BatangasChili;

/**
 * BatangasStore
 */
public class BatangasStore extends BibingkaStore {
	public Bibingka createBibingka(String type) {
		Bibingka bibingka = new BatangasBibingkaFactory().createBibingka(type, ingredientFactory);
		return bibingka;
	}
}
