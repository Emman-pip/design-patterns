package src.IngredientFactories;

import src.Bibingkas.*;
import src.RiceTypes.*;
import src.Sauces.*;
import src.Toppings.*;

/**
 * BatangasIngredientFactory
 */
public class BatangasIngredientFactory extends IngredientFactory {
	public Sauce createSauce(Bibingka bibingka) {
		Sauce sauce = null;
		if (bibingka.getType().equals("sweet")) {
			sauce = new SugarBatangasStyle();
		} else {
			System.out.println("Invalid type, no sauce chosen");
		}
		return sauce;
	}

	public Toppings createToppings(Bibingka bibingka) {
		Toppings toppings = null;
		if (bibingka.getType().equals("sweet")) {
			toppings = new BatangasNiyog();
		} else {
			System.out.println("Invalid type, no topping chosen");
		}

		return toppings;
	}

	public RiceType createRice(Bibingka bibingka) {
		RiceType rice = null;
		if (bibingka.getType().equals("sweet")) {
			rice = new BatangasMalagkit();
		} else {
			System.out.println("Invalid type, no rice type chosen");
		}

		return rice;
	}

}
