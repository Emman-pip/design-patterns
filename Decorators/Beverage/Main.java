public class Main {
	public static void main(String[] args) {
		HouseBlend houseBlend = new HouseBlend();
		System.out.println(houseBlend.getDescription());

		Milk milk = new Milk(houseBlend);
		System.out.println(milk.getDescription());

		Milk milk2 = new Milk(milk);
		System.out.println(milk2.getDescription());

		Whip whip = new Whip(milk2);
		System.out.println(whip.getDescription());

		Mocha mocha = new Mocha(whip);
		System.out.println(mocha.getDescription());

		System.out.println(mocha.cost());
	}
}
