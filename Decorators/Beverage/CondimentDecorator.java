abstract public class CondimentDecorator extends Beverage {
	public String getDescription() {
		return "+ " + super.getDescription();
	}

}
