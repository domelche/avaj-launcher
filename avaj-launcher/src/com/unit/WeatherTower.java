
package com.unit;

public class WeatherTower extends Tower {

	public String getWeather(Coordinates coordinates) {

		return WeatherProvider.getWeatherProvider().getCurrentWeather(coordinates);
	}

	void changeWeather() {

		this.conditionsChanged();
	}
}
