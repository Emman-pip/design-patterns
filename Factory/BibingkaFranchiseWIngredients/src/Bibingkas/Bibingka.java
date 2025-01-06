package src.Bibingkas;

import src.RiceTypes.RiceType;
import src.Sauces.Sauce;
import src.Toppings.Toppings;
import src.IngredientFactories.IngredientFactory;

public abstract class Bibingka {
	IngredientFactory ingredientFactory;
	protected String name;
	protected String type;

	public String getType() {
		return type;
	}

	public String getName() {
		return name;
	}

	public Bibingka(IngredientFactory ingredientFactory) {
		this.riceType = ingredientFactory.createRice(this);
		this.sauce = ingredientFactory.createSauce(this);
		this.toppings = ingredientFactory.createToppings(this);
	}

	protected RiceType riceType;
	protected Sauce sauce;
	protected Toppings toppings;

	public RiceType getRiceType() {
		return riceType;
	}

	public Sauce getSauce() {
		return sauce;
	}

	public Toppings getToppings() {
		return toppings;
	}
}
