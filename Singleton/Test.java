public class Test {
	public static void main(String[] args) {
		// Instance of the Chocolate boiler object
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();

		boiler.fill();

		boiler.drain();
		boiler.boil();
		boiler.fill();
		boiler.fill();

		// Same instance used here even though different combination.
		ChocolateBoiler boilerInstance2 = ChocolateBoiler.getInstance();
		boilerInstance2.fill();
		boilerInstance2.fill();
		boilerInstance2.fill();

		// Singleton pattern ensures a class has only one instance, and provides a
		// global point of access to it

	}
}
