package com.previred.cache.infinispan.services;

import com.previred.cache.infinispan.domain.LocationWeather;


public interface WeatherService {
	public LocationWeather getWeatherForLocation(String location);
}
