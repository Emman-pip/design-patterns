package src.Stores;

import src.Bibingkas.*;

/**
 * BatangasStore
 */
public class BatangasStore extends BibingkaStore {
	public Bibingka createBibingka(String type) {
		Bibingka bibingka = null;
		if (type.equals("sweet")) {
			bibingka = new BatangasSweetBibingka(this.ingredientFactory);
		} else {
			System.out.println("Invalid type");
		}
		return bibingka;
	}
}
