import java.util.ArrayList;

public abstract class Bibingka {
	protected String description;
	protected ArrayList<String> topping = new ArrayList<>();
	protected String riceType;
	protected String sauce;

	public void setDescription(String description) {
		this.description = description;
	}

	public void setRiceType(String riceType) {
		this.riceType = riceType;
	}

	public void setSauce(String sauce) {
		this.sauce = sauce;
	}

	public void description() {
		System.out.println("preparing " + this.description + "...");
	}

	public void sauce() {
		System.out.println("putting special " + this.sauce + " sauce");
	}

	public void topping() {
		System.out.print("toppings: ");
		for (String toppings : this.topping) {
			System.out.print(toppings + " ");
		}
		System.out.println();
	}

	public void riceType() {
		System.out.println(this.riceType);
	}

	public void slice() {
		System.out.println("Slice to equal squares.");
	}

	public void box() {
		System.out.println("Put to small box.");
	}

	public void deliver() {
		System.out.println("deliver!!");
	}
}
