import java.util.*;
/*
 * The updates that would be implemented will only apply to the objects.
 * How it is implemented on the front end is out of scope.
 * */

import java.util.ArrayList;

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

/**
 * Subject
 */
interface Subject {
	/*
	 * This interface will require a list of observers during the implementation
	 */
	public void registerUsers(Observer observer);

	public void removeUsers(Observer observer);

	public void notifyUsers();
}

/**
 * Observer
 */
interface Observer {
	public void update(float temp, float humidity, float pressure);
}

/**
 * Display
 */
interface Display {
	public void display();
}

// implementations

/**
 * WeatherData
 *
 * The weather data class is an implementation of the subject interface.
 * It uses an array to store the observers during runtime and bases updates on
 * that
 */
class WeatherData implements Subject {
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

// displays (current, statistics, forecast display)
class CurrentConditions implements Observer, Display {
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

class HeatIndexDisplay implements Observer, Display {
	private float t;
	private float rh;
	private float pressure;
	private double heatIndex;
	private WeatherData weatherData;

	public HeatIndexDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.weatherData.registerUsers(this);
	}

	public void update(float temp, float humidity, float pressure) { // idk formula ng heat index..
		this.t = temp;
		this.rh = humidity;
		this.pressure = pressure;
		this.heatIndex = (float) ((16.923 + (0.185212 * t) + (5.37941 * rh) - (0.100254 * t * rh)
				+ (0.00941695 * (t * t)) + (0.00728898 * (rh * rh))
				+ (0.000345372 * (t * t * rh)) - (0.000814971 * (t * rh * rh)) +
				(0.0000102102 * (t * t * rh * rh)) - (0.000038646 * (t * t * t)) + (0.0000291583 *
						(rh * rh * rh))
				+ (0.00000142721 * (t * t * t * rh)) +
				(0.000000197483 * (t * rh * rh * rh)) - (0.0000000218429 * (t * t * t * rh * rh)) +
				0.000000000843296 * (t * t * rh * rh * rh)) -
				(0.0000000000481975 * (t * t * t * rh * rh * rh)));
		display();
	}

	public void display() {
		System.out.println("Heat Index: " + this.heatIndex);
	}

}

class StatisticsDisplay implements Display, Observer {
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
