/*
 * Whip class
 *
 * Whip condiment
 */

public class Whip extends CondimentsDecorator {
	Beverage beverage;
	double condimentCost = .10;

	public Whip(Beverage beverage) {
		this.beverage = beverage;
		this.setSize(beverage.getSize());
		this.condimentCost += (this.beverage.getSize() == Beverage.Size.TALL) ? .10
				: (this.beverage.getSize() == Beverage.Size.MEDIUM) ? .15 : .20;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Whip";
	}

	public double cost() {
		return this.beverage.cost() + this.condimentCost;
	}
}
