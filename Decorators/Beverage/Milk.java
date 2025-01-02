public class Milk extends CondimentDecorator {
	private double cost = .25;
	private Beverage beverage;

	public Milk(Beverage beverage) {
		setDescription("milk");
		this.beverage = beverage;
	}

	public double cost() {
		return this.cost + this.beverage.cost();
	}
}
