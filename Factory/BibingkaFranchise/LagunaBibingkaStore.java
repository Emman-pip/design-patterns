/**
 * LagunaBibingkaStore
 */
public class LagunaBibingkaStore extends BibingkaStore {
	public Bibingka createBibingka(String type) {
		return new LagunaBibingkaFactory().create(type);
	}

}
