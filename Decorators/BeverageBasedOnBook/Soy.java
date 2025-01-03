/*
 * Soy class
 *
 * Soy condiment
 */

public class Soy extends CondimentsDecorator {
	Beverage beverage;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return this.beverage.cost() + .15;
	}
}
