public class Decaf extends Beverage {
	private double cost = 5.99;

	public Decaf() {
		setDescription("Decaf");
	}

	@Override
	public String getDescription() {
		return "Ordered" + super.getDescription();
	}

	public double cost() {
		return this.cost;
	}
}
