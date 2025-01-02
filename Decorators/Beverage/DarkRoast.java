public class DarkRoast extends Beverage {
	private double cost = 3.99;

	public DarkRoast() {
		setDescription("Dark Roast");
	}

	@Override
	public String getDescription() {
		return "Ordered" + super.getDescription();
	}

	public double cost() {
		return this.cost;
	}
}
