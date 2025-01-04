public class BatangasStore extends BibingkaStore {
	BibingkaFactory factory = new BatangasBibingkaFactory();

	public Bibingka createBibingka(String type) {
		return factory.create("sweet");
	}
}
