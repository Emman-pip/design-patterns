import java.util.ArrayList;

/*
 * The updates that would be implemented will only apply to the objects.
 * How it is implemented on the frontend is out of scope.
 * */
public class Main {
	public static void main(String[] args) {
		// testing here
		WeatherData weatherData = new WeatherData();
		// shesh, multiple type of displays integrating with each other through duck
		// tying :()
		weatherData.addObserver(new CurrentConditions());
		weatherData.addObserver(new StatisticsDisplay());
		weatherData.addObserver(new HeatIndexDisplay());
		new ForecastDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f); // this broadcasts the information to all objects connected
		weatherData.setMeasurements(82, 64, 30.4f); // this broadcasts the information to all objects connected
		weatherData.setMeasurements(69, 59, 20.4f); // this broadcasts the information to all objects connected
		weatherData.setMeasurements(50, 59, 100);
	}
}
