/*
 * Mocha class
 *
 * Mocha condiment
 */

public class Mocha extends CondimentsDecorator {
	Beverage beverage;
	double condimentCost = .20;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
		this.setSize(beverage.getSize());
		this.condimentCost += (this.beverage.getSize() == Beverage.Size.TALL) ? .10
				: (this.beverage.getSize() == Beverage.Size.MEDIUM) ? .15 : .20;
	}

	public String getDescription() {
		return beverage.getDescription() + ", Mocha";
	}

	public double cost() {
		return this.beverage.cost() + this.condimentCost;
	}
}
