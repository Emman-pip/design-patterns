import java.util.Observable;
import java.util.Observer;

// displays (current, statistics, forecast display)
public class CurrentConditions implements Observer, Display {
	private float temp;
	private float humidity;
	Observable observable;

	public CurrentConditions() {
	}

	public void update(Observable obs, Object arg) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.temp = weatherData.getTemp();
			this.humidity = weatherData.getHumidity();
			display();
		}
	};

	public void display() {
		System.out.println("The temp is: " + temp + "\tHumidity is: " + humidity);
	}
}
