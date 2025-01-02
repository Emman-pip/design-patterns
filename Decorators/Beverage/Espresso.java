public class Espresso extends Beverage {
	private double cost = 2.99;

	public Espresso() {
		setDescription("Espresso");
	}

	@Override
	public String getDescription() {
		return "Ordered" + super.getDescription();
	}

	public double cost() {
		return this.cost;
	}
}
