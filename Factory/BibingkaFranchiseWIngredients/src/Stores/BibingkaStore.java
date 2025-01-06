package src.Stores;

import src.Bibingkas.Bibingka;
import java.util.ArrayList;

/**
 * BibingkaStore
 */
public abstract class BibingkaStore {
	public void order(String type) {

	}

	public abstract Bibingka createBibingka(String type);

	public void slice(Bibingka bibingka) {
		System.out.println("slicing " + bibingka.getName() + " a " + bibingka.getType() + " bibingka to pieces!");
	}

	public void box(Bibingka bibingka) {
		System.out.println("Putting " + bibingka.getName() + " a " + bibingka.getType() + " bibingka to a pretty box!");
	}

	private void readIngredients(ArrayList<String> arr) {
		for (String item : arr) {
			System.out.println("\titem");
		}
		System.out.println();
	}

	public void prep(Bibingka bibingka) {
		System.out.println("Preparing " + bibingka.getName() + ", " + bibingka.getType() + "...");

	}
}
