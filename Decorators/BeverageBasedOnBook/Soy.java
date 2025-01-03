/*
 * Soy class
 *
 * Soy condiment
 */

public class Soy extends CondimentsDecorator {
	Beverage beverage;
	double condimentCost = .15;

	public Soy(Beverage beverage) {
		this.beverage = beverage;
		this.setSize(beverage.getSize());
		this.condimentCost += (this.beverage.getSize() == Beverage.Size.TALL) ? .10
				: (this.beverage.getSize() == Beverage.Size.MEDIUM) ? .15 : .20;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Soy";
	}

	public double cost() {
		return this.beverage.cost() + this.condimentCost;
	}
}
