public class Whip extends CondimentDecorator {
	private double cost = .59;
	private Beverage beverage;

	public Whip(Beverage beverage) {
		setDescription("whip");
		this.beverage = beverage;
	}

	public double cost() {
		return this.cost + this.beverage.cost();
	}
}
