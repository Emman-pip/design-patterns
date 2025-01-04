public class BatangasBibingkaFactory extends BibingkaFactory {
	public Bibingka create(String type) {
		if (type.equals("sweet")) {
			return new BatangasSweetBibingka();
		} else {
			return new BatangasSweetBibingka();
		}
	}
}
