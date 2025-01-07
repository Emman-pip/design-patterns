public class ChocolateBoiler {
	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler boiler = null;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	public static ChocolateBoiler getInstance() {
		if (boiler == null) {
			boiler = new ChocolateBoiler();
		}
		return boiler;
	}

	public void fill() {
		if (isEmpty()) {
			System.out.println("Filling up the chocolate boiler...");
			empty = false;
			boiled = false;
			System.out.println("The boiler is now filled!!!");
		} else {
			System.out.println("Invalid operation: The boiler is not empty!");
		}
	}

	public void drain() {
		if (!isEmpty() && isBoiled()) {
			// drain the milk and chocolate
			System.out.println("Draining the boilerrr");
			empty = true;
		} else {
			System.out.println("Cannot drain the boiler: either empty or not yet boiled");
		}

	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			// boil the contents
			boiled = true;
			System.out.println("Boiling the contents of the boiler...");
		} else {
			System.out.println("Cannot boil: the contents are already boiling or the boiler is empty");
		}

	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
