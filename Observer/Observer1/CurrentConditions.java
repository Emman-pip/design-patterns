// displays (current, statistics, forecast display)
public class CurrentConditions implements Observer, Display {
	private float temp;
	private float humidity;
	private float pressure;
	private Subject weatherData;

	public CurrentConditions(Subject newWeatherData) {
		this.weatherData = newWeatherData;
		this.weatherData.registerUsers(this);

	}

	public void update(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		display();
	};

	public void display() {
		System.out.println("The temp is: " + temp + "\tHumidity is: " + humidity + "\tPressure is: " + pressure);
	}
}
