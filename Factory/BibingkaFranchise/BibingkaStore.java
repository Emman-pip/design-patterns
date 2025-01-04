public abstract class BibingkaStore {
	public void order(String type) {
		Bibingka bibingka = createBibingka(type);
		bibingka.description();
		bibingka.topping();
		bibingka.riceType();
		bibingka.sauce();
		bibingka.slice();
		bibingka.box();
		bibingka.deliver();
	}

	public abstract Bibingka createBibingka(String type);
}
