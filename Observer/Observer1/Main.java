import java.util.ArrayList;

/*
 * The updates that would be implemented will only apply to the objects.
 * How it is implemented on the frontend is out of scope.
 * */
public class Main {
	public static void main(String[] args) {
		// testing here
		WeatherData weatherData = new WeatherData();
		ArrayList<Observer> obs = new ArrayList<>();
		obs.add(new CurrentConditions(weatherData)); // shesh, multiple type of displays integrating with each other through
																									// duck tying :()
		obs.add(new StatisticsDisplay(weatherData));
		obs.add(new HeatIndexDisplay(weatherData));

		weatherData.setMeasurements(80, 65, 30.4f); // this broadcasts the information to all objects connected
		weatherData.setMeasurements(82, 64, 30.4f); // this broadcasts the information to all objects connected
		weatherData.setMeasurements(83, 63, 30.4f); // this broadcasts the information to all objects connected
		weatherData.setMeasurements(93, 63, 30.4f); // this broadcasts the information to all objects connected
		weatherData.setMeasurements(100, 63, 30.4f); // this broadcasts the information to all objects connected
	}
}