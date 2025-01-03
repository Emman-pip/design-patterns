// Based on book
/*
 * Beverage
 * This is the super type for the decorators and objects to be decorated with
 * */
abstract public class Beverage {
	public enum Size {
		TALL, MEDIUM, VENTI
	};

	Size size = Size.TALL;

	public void setSize(Size size) {
		this.size = size;
	}

	public Size getSize() {
		return size;
	}

	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
