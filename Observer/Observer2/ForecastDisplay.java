import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Display, Observer {
	private float currentPressure = 29.92f;
	private float lastPressure;

	public ForecastDisplay(Observable obs) {
		obs.addObserver(this);
	}

	public void update(Observable obs, Object obj) {
		if (obs instanceof WeatherData) {
			WeatherData weatherData = (WeatherData) obs;
			this.lastPressure = this.currentPressure;
			this.currentPressure = weatherData.getPressure();

			display();
		}
	}

	public void display() {
		String forecast = (currentPressure > lastPressure) ? "Greater weather ahead! (hotter)"
				: (currentPressure < lastPressure) ? "It might rain more tommorow." : "Same same";
		System.out.println("Forecast: " + forecast);
	}
}
