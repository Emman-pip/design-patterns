public class HouseBlend extends Beverage {
	private double cost = 1.99;

	public HouseBlend() {
		setDescription("House blend");
	}

	@Override
	public String getDescription() {
		return "Ordered" + super.getDescription();
	}

	public double cost() {
		return this.cost;
	}
}
