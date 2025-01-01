import java.util.ArrayList;
// implementations

/**
 * WeatherData
 *
 * The weather data class is an implementation of the subject interface.
 * It uses an array to store the observers during runtime and bases updates on
 * that
 */
public class WeatherData implements Subject {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private float temp;
	private float humidity;
	private float pressure;

	public void registerUsers(Observer observer) {
		this.observers.add(observer);
	};

	public void removeUsers(Observer observer) {
		this.observers.remove(observer);
	};

	public void notifyUsers() {
		for (Observer observer : this.observers) {
			observer.update(temp, humidity, pressure);
		}
	};

	private void changedMeasurements() {
		notifyUsers();
	}

	public void setMeasurements(float newTemp, float newHumidity, float newPressure) {
		temp = newTemp;
		humidity = newHumidity;
		pressure = newPressure;

		changedMeasurements();
	}
}
