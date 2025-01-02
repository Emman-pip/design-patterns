public class Mocha extends CondimentDecorator {
	private double cost = .29;
	private Beverage beverage;

	public Mocha(Beverage beverage) {
		setDescription("mocha");
		this.beverage = beverage;
	}

	public double cost() {
		return this.cost + this.beverage.cost();
	}
}
