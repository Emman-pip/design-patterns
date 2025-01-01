import java.util.*;

public class StatisticsDisplay implements Display, Observer {
	private float temp;
	private float humidity;
	private float pressure;
	private WeatherData weatherData;
	private ArrayList<Float> temps = new ArrayList<>();

	public StatisticsDisplay(WeatherData data) {
		this.weatherData = data;
		this.weatherData.registerUsers(this);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		temps.add(temp);
		display();
	}

	public float getAverageTemp() {
		float total = 0;
		for (float item : this.temps) {
			total += item;
		}
		return total / (temps.size());
	}

	public double getMinTemp() {
		return Collections.min(temps);
	}

	public double getMaxTemp() {
		return Collections.max(temps);
	}

	public void display() {
		System.out.println("Avg temp: " + getAverageTemp() + "\tmin: " + getMinTemp() + "\tmax: " + getMaxTemp());
	}
}
