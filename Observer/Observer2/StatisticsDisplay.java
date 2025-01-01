import java.util.*;

public class StatisticsDisplay implements Display, java.util.Observer {
	private float temp;
	private WeatherData weatherData;
	ArrayList<Float> temps = new ArrayList<>();

	public StatisticsDisplay() {
	}

	public void update(Observable obs, Object o) {
		if (obs instanceof WeatherData) {
			this.weatherData = (WeatherData) obs;
			this.temp = this.weatherData.getTemp();
			temps.add(this.temp);
			display();
		}
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
