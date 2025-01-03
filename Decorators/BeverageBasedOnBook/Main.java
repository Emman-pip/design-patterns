public class Main {
	public static void main(String[] args) {
		Beverage beverage = new Espresso();
		beverage.setSize(Beverage.Size.TALL);
		beverage = new Mocha(beverage);
		System.out.println(beverage.getSize() + " " + beverage.getDescription() + ": $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2.setSize(Beverage.Size.MEDIUM);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getSize() + " " + beverage2.getDescription() + ": $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3.setSize(Beverage.Size.VENTI);
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getSize() + " " + beverage3.getDescription() + ": $" + beverage3.cost());
	}
}
