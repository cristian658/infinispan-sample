package com.previred.cache.infinispan.domain;

public class LocationWeather {
	
	final float temperature;
	final String conditions;
	final String country;

	public LocationWeather(float temperature, String conditions, String country) {
		this.temperature = temperature;
		this.conditions = conditions;
		this.country = country;
	}

	@Override
	public String toString() {
		return "LocationWeather [temperature=" + temperature + ", conditions="
				+ conditions + ", country=" + country + "]";
	}

	
}
