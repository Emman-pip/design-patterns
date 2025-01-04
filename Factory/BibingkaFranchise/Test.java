/**
 * Test
 */
public class Test {
	public static void main(String[] args) {
		BibingkaStore batangasStore = new BatangasStore();
		batangasStore.order("sweet");

		BibingkaStore lagunaStore = new LagunaBibingkaStore();
		lagunaStore.order("sweet");
	}
}
