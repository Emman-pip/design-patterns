import java.util.ArrayList;
import java.util.Observable;
// implementations

/**
 * WeatherData
 *
 * The weather data class is an implementation of the subject interface.
 * It uses an array to store the observers during runtime and bases updates on
 * that
 */
public class WeatherData extends Observable {
	private ArrayList<Observer> observers = new ArrayList<Observer>();
	private float temp;
	private float humidity;
	private float pressure;

	public float getTemp() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

	public WeatherData() {
	}

	private void changedMeasurements() {
		setChanged();
		notifyObservers();
	}

	public void setMeasurements(float newTemp, float newHumidity, float newPressure) {
		temp = newTemp;
		humidity = newHumidity;
		pressure = newPressure;

		changedMeasurements();
	}
}
