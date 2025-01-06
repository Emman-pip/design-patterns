package src.IngredientFactories;

import src.Bibingkas.Bibingka;
import src.RiceTypes.RiceType;
import src.Sauces.Sauce;
import src.Toppings.Toppings;

public abstract class IngredientFactory {
	public abstract RiceType createRice(Bibingka bibingka);

	public abstract Sauce createSauce(Bibingka bibingka);

	public abstract Toppings createToppings(Bibingka type);
}
