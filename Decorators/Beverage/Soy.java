public class Soy extends CondimentDecorator {
	private double cost = .79;
	private Beverage beverage;

	public Soy(Beverage beverage) {
		setDescription("soy");
		this.beverage = beverage;
	}

	public double cost() {
		return this.cost + this.beverage.cost();
	}
}
