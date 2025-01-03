// Based on book
/*
 * Beverage
 * This is the super type for the decorators and objects to be decorated with
 * */
abstract public class Beverage {
	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}
