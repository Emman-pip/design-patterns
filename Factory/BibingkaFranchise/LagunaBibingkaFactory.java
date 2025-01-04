/**
 * LagunaBibingkaFactory
 */
public class LagunaBibingkaFactory extends BibingkaFactory {
	public Bibingka create(String type) {
		if (type.equals("sweet")) {
			return new LagunaSweetBibingka();
		}
		return new LagunaSweetBibingka();
	}

}
